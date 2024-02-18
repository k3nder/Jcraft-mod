package net.k3nder;

import net.fabricmc.api.ModInitializer;


import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.k3nder.json.parser.ItemGroup.JIGroup;
import net.k3nder.json.parser.block.JBlock;
import net.k3nder.json.parser.item.JItem;
import net.k3nder.json.parser.pack.JPack;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.server.command.CommandManager;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static net.minecraft.registry.Registries.*;

public class Blockkey implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("blockkey");
    public static final File BLOCKS_PATH = new File("jcraft/items");
    public static final File ITEMS_PATH = new File("jcraft/items");
    public static final File PACK_PATH = new File("jcraft");
    public static final File INV_GROUP_PATH = new File("jcraft/invgroup");

    @Override
	public void onInitialize() {
        try {
            jload();
        } catch (IOException e) {
            LOGGER.error(e.getMessage());
        }
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
            dispatcher.register(CommandManager.literal("jload").executes(context -> {
                try {
                    jload();
                } catch (IOException e) {
                    LOGGER.error(e.getMessage());
                }
                LOGGER.info("INFOWE");
                return 0;
            }));
        });

        LOGGER.info("welcome to blockkey, see the docs: ");
	}
    private void jload() throws IOException {
        List<JBlock> blocks = getBlocks();
        LOGGER.info(String.format("%s groups to load", blocks.size()));
        List<JPack> packs = getPacks();
        LOGGER.info(String.format("%s packs to load", packs.size()));
        List<JItem> items = getItems();
        LOGGER.info(String.format("%s items to load", items.size()));
        List<JIGroup> groups = getGroups();
        LOGGER.info(String.format("%s groups to load", groups.size()));
        convertAndRegistryBlocks(blocks);
        convertAndRegistryPack(packs);
        convertAndRegistryItems(items);
        convertAndRegistryGroups(groups);
    }
    private void convertAndRegistryPack(List<JPack> packs){
        for(JPack pack : packs){
            LOGGER.info(String.format("loading pack: %s", pack));
            convertAndRegistryBlocks(pack.blocks);
            convertAndRegistryItems(pack.items);
            convertAndRegistryGroups(pack.groups);
            LOGGER.info(String.format("pack %s loaded", pack));
        }
    }


    private void convertAndRegistryBlocks(List<JBlock> blocks){
        LOGGER.info("loading groups");
        for(JBlock block : blocks){
            LOGGER.info(String.format("loading block: %s:%s", block.namespace,block.name));
            try {
                if(BLOCK.containsId(new Identifier(block.namespace, block.name))) continue;
                registryBlock(block);
            } catch (NoSuchFieldException | IllegalAccessException e) {
                LOGGER.error(e.getMessage());
            }
        }
    }
    private void convertAndRegistryGroups(List<JIGroup> groups){
        LOGGER.info("loading groups");
        for(JIGroup group : groups){
            LOGGER.info(String.format("loading group: %s:%s", group.namespace,group.name));
            try {
                if(group.name != null || group.namespace != null) {
                    assert group.name != null;
                    if(BLOCK.containsId(new Identifier(group.namespace, group.name))) continue;
                }
                registryGroup(group);
            } catch (NoSuchFieldException | IllegalAccessException e) {
                LOGGER.error(e.getMessage());
            }
        }
    }

    private void registryGroup(JIGroup group) throws NoSuchFieldException, IllegalAccessException {
        if(group.namespace == null || group.name == null) {
            group.toGroup();
            return;
        }
        Registry.register(Registries.ITEM_GROUP, new Identifier(group.namespace, group.name), group.toGroup());
    }

    private void convertAndRegistryItems(List<JItem> items){
        LOGGER.info("loading items");
        if(items == null) return;
        for(JItem item : items){
            LOGGER.info(String.format("loading item: %s:%s", item.namespace,item.name));
            try {
                if(ITEM.containsId(new Identifier(item.namespace, item.name))) continue;
                registryItem(item);
            } catch (NoSuchFieldException | IllegalAccessException e) {
                LOGGER.error(e.getMessage());
            }
        }
    }
    private void registryBlock(JBlock block) throws NoSuchFieldException, IllegalAccessException {
        Block vanillaBlock = block.toBlock();
        Registry.register(BLOCK, new Identifier(block.namespace, block.name), vanillaBlock);
        if(block.item != null) if(block.item) Registry.register(Registries.ITEM,new Identifier(block.namespace, block.name), new BlockItem(vanillaBlock, new FabricItemSettings()));
    }
    public void registryItem(JItem item) throws NoSuchFieldException, IllegalAccessException {
        Item vanillaItem = item.toItem();
        Registry.register(ITEM, new Identifier(item.namespace,item.name), vanillaItem);
    }
    private List<JBlock> getBlocks(){
        List<JBlock> result = new ArrayList<>();
        if(!BLOCKS_PATH.exists()) BLOCKS_PATH.mkdir();
        if (BLOCKS_PATH.exists()) {
            Arrays.stream(Objects.requireNonNull(BLOCKS_PATH.listFiles())).toList()
                    .stream()
                    .filter(File -> File.isFile() && File.getName().contains("json"))
                    .forEach(File -> {
                        try {
                            result.add(JBlock.load(File));
                        } catch (IOException e) {
                            LOGGER.error(e.getMessage());
                        }
                    });
        }
        return result;
    }
    private List<JItem> getItems(){
        List<JItem> result = new ArrayList<>();
        if(!ITEMS_PATH.exists()) ITEMS_PATH.mkdir();
        if (ITEMS_PATH.exists()) {
            Arrays.stream(Objects.requireNonNull(ITEMS_PATH.listFiles())).toList()
                    .stream()
                    .filter(File -> File.isFile() && File.getName().contains("json"))
                    .forEach(File -> {
                        try {
                            result.add(JItem.load(File));
                        } catch (IOException e) {
                            LOGGER.error(e.getMessage());
                        }
                    });
        }
        return result;
    }
    public List<JPack> getPacks(){
        List<JPack> result = new ArrayList<>();
        if(!PACK_PATH.exists()) PACK_PATH.mkdir();
        if (PACK_PATH.exists()) {
            Arrays.stream(PACK_PATH.listFiles()).toList()
                    .stream()
                    .filter(File -> File.isFile() && File.getName().contains("zip"))
                    .forEach(File -> {
                        try {

                            result.add(JPack.load(File));
                        } catch (IOException e) {
                            LOGGER.error(e.getMessage());
                        }
                    });
        }
        return result;
    }
    public List<JIGroup> getGroups(){
        List<JIGroup> result = new ArrayList<>();
        if(!INV_GROUP_PATH.exists()) INV_GROUP_PATH.mkdir();
        if (INV_GROUP_PATH.exists()) {
            Arrays.stream(Objects.requireNonNull(INV_GROUP_PATH.listFiles())).toList()
                    .stream()
                    .filter(File -> File.isFile() && File.getName().contains("json"))
                    .forEach(File -> {
                        try {
                            result.add(JIGroup.load(File));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
        }
        return result;
    }
}