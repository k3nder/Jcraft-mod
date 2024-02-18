package net.k3nder.json.parser.item;

import com.google.gson.Gson;
import net.k3nder.json.parser.block.JBlock;
import net.k3nder.json.parser.settings.block.JBSettings;
import net.k3nder.json.parser.settings.item.JISettings;
import net.kender.Kjson.Json;
import net.minecraft.item.Item;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class JItem {
    public String namespace;
    public String name;
    public JISettings settings;

    public static JItem load(File file) throws IOException {
        Gson gson = new Gson();
        return gson.fromJson(Json.sCcontentOf(file.toURL().toString()), JItem.class);
    }
    public static JItem load(BufferedReader file) throws IOException {
        Gson gson = new Gson();
        String line;
        StringBuilder content = new StringBuilder();
        while ((line = file.readLine()) != null) {
            content.append(line);
        }
        file.close();
        return gson.fromJson(content.toString(), JItem.class);
    }

    public Item toItem() {
        Item result = new Item(settings.toSettings());
        return result;
    }
}
