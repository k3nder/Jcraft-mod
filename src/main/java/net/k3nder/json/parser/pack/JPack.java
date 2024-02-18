package net.k3nder.json.parser.pack;

import net.k3nder.json.parser.ItemGroup.JIGroup;
import net.k3nder.json.parser.block.JBlock;
import net.k3nder.json.parser.item.JItem;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class JPack {
    public List<JBlock> blocks;
    public List<JItem> items;
    public List<JIGroup> groups;
    public String author;

    public static JPack load(File zip) throws IOException {
        JPack result = new JPack();
        result.blocks = new ArrayList<>();
        result.items = new ArrayList<>();
        result.groups = new ArrayList<>();
        ZipFile zipFile = new ZipFile(zip);

        Enumeration<? extends ZipEntry> entries = zipFile.entries();

        while(entries.hasMoreElements()){
            ZipEntry entry = entries.nextElement();
            if("pack.mcmeta".equals(entry.getName())) /*ejectar la logica si es el pack.mcmeta*/;
            if(entry.getName().contains("blocks"))
                result.blocks.add(JBlock.load(new BufferedReader(new InputStreamReader(zipFile.getInputStream(entry)))));
            if(entry.getName().contains("items")) {
                result.items.add(JItem.load(new BufferedReader(new InputStreamReader(zipFile.getInputStream(entry)))));
            }
            if(entry.getName().contains("invgroup")) {
                result.groups.add(JIGroup.load(new BufferedReader(new InputStreamReader(zipFile.getInputStream(entry)))));
            }
        }
        return result;
    }
}
