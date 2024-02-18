package net.k3nder.json.parser.block;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.Gson;
import net.k3nder.json.parser.settings.block.JBSettings;
import net.kender.Kjson.Json;
import net.minecraft.block.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

@JsonIgnoreProperties(ignoreUnknown = true)
public class JBlock {
    public String namespace;
    public String name;
    public String type;
    public Boolean item;
    public JBSettings settings;

    public static JBlock load(File file) throws IOException {
        Gson gson = new Gson();
        return gson.fromJson(Json.sCcontentOf(file.toURL().toString()), JBlock.class);
    }
    public static JBlock load(BufferedReader file) throws IOException {
        Gson gson = new Gson();
        String line;
        StringBuilder content = new StringBuilder();
        while ((line = file.readLine()) != null) {
            content.append(line);
        }
        file.close();
        return gson.fromJson(content.toString(), JBlock.class);
    }


    public Block toBlock() throws NoSuchFieldException, IllegalAccessException {
        JBlock block = this;
        Block Block = new Block(block.settings.toSettings());
        if(type == null) return Block;
        if(type.equals("pilar")){
            Block = new PillarBlock(block.settings.toSettings());
        } else if(type.equals("wall")){
            Block = new WallBlock(block.settings.toSettings());
        } else if(type.equals("stairs")){
            Block = new StairsBlock(getBaseBlockState(),block.settings.toSettings());
        } else if(type.equals("slab")){
            System.out.println("slab block");
            Block = new SlabBlock(block.settings.toSettings());
        }
        return Block;
    }
    private static BlockState getBaseBlockState() {
        return Blocks.STONE_STAIRS.getDefaultState();
    }
}