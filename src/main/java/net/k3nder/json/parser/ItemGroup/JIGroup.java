package net.k3nder.json.parser.ItemGroup;

import com.google.gson.Gson;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.impl.itemgroup.FabricItemGroup;
import net.k3nder.json.parser.block.JBlock;
import net.kender.Kjson.Json;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.List;

import static net.minecraft.registry.Registries.ITEM;

public class JIGroup {
    public String namespace;
    public String name;
    public int column;
    public String existing;
    public String display;
    public ItemId icon;
    public List<ItemId> items;

    public static JIGroup load(File file) throws IOException {
        Gson gson = new Gson();
        return gson.fromJson(Json.sCcontentOf(file.toURL().toString()), JIGroup.class);
    }
    public static JIGroup load(BufferedReader file) throws IOException {
        Gson gson = new Gson();
        String line;
        StringBuilder content = new StringBuilder();
        while ((line = file.readLine()) != null) {
            content.append(line);
        }
        file.close();
        return gson.fromJson(content.toString(), JIGroup.class);
    }
    public ItemGroup toGroup() throws NoSuchFieldException, IllegalAccessException {
        if(existing != null) {
            RegistryKey<ItemGroup> exist = (RegistryKey<ItemGroup>) ItemGroups.class.getField(existing).get(new ItemGroups());
            ItemGroupEvents.modifyEntriesEvent(exist).register(content -> {
                for(ItemId item: items){
                    content.add(new ItemStack(ITEM.get(new Identifier(item.namespace,item.name))));
                }
            });
            return null;
        }

        ItemGroup.Builder result = new ItemGroup.Builder(ItemGroup.Row.TOP,column);
        result.icon(() -> new ItemStack(ITEM.get(new Identifier(icon.namespace,icon.name))));
        result.displayName(Text.translatable(display));
        result.entries((context, entries) -> {
            for(ItemId item: items){
                entries.add(new ItemStack(ITEM.get(new Identifier(item.namespace,item.name))));
            }
        });
        return result.build();
    }
}
