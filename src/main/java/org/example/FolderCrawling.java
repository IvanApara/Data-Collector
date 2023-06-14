package org.example;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FolderCrawling {

    private static final String DATA = "C:/Users/User/Desktop/stations-data/data";
    private static final String MACOSX = "C:/Users/User/Desktop/stations-data/__MACOSX";
    List<Path> data = new ArrayList<>();
    List<Path> macosx = new ArrayList<>();

    public List walkDataFolder() throws Exception{
        Files.walk(Paths.get(DATA))
                .forEach(file -> {
                    if(file.toFile().isFile() && file.toFile().getPath().endsWith(".json")){
                        data.add(file.toAbsolutePath());
                    }

                    if(file.toFile().isFile() && file.toFile().getPath().endsWith(".csv")){
                        data.add(file.toAbsolutePath());
                    }
                });
        return data;
    }

    public List walkMacosx() throws Exception{
        Files.walk(Paths.get(MACOSX))
                .forEach(file -> {
                    if(file.toFile().isFile() && file.toFile().getPath().endsWith(".json")){
                        macosx.add(file.toAbsolutePath());
                    }

                    if(file.toFile().isFile() && file.toFile().getPath().endsWith(".csv")){
                        macosx.add(file.toAbsolutePath());
                    }
                });
        return macosx;
    }

}
