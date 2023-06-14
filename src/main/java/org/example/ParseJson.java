package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ParseJson {
    List<MetroDepth> metro = new ArrayList<>();

    public List<MetroDepth> parseJson()throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();
        String json = Files.readString
                (Paths.get("data/depths-1.json"));
        metro = objectMapper.readValue(json, new TypeReference<List<MetroDepth>>() {});
        return metro;
    }


}
