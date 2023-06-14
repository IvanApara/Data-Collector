package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class JsonEntry {

    public void stationEntryJson() throws Exception{
        StationInformation stationInformation = new StationInformation();
        stationInformation.addedInformation();
        FileWriter fileWriter = new FileWriter("data/station.json");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        gson.toJson(stationInformation, fileWriter);
    }

    public void lineEntryJson()throws Exception{
        List<LineList> list = new ArrayList<>();
        LineList one = new LineList();
        LineList two = new LineList();
        LineList three = new LineList();
        LineList four = new LineList();
        LineList five = new LineList();
        LineList six = new LineList();
        LineList seven = new LineList();
        LineList eight = new LineList();
        LineList nine = new LineList();
        LineList ten = new LineList();
        LineList eleven = new LineList();
        LineList elevenA = new LineList();
        LineList twelve = new LineList();
        LineList fifteen = new LineList();
        LineList d1 = new LineList();
        LineList d2 = new LineList();

        one.addedObjectLine();

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        list.add(five);
        list.add(six);
        list.add(seven);
        list.add(eight);
        list.add(nine);
        list.add(ten);
        list.add(eleven);
        list.add(elevenA);
        list.add(twelve);
        list.add(fifteen);
        list.add(d1);
        list.add(d2);



        FileWriter fileWriter = new FileWriter("data/line.json");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        list.forEach(lineList -> {
            gson.toJson(lineList, fileWriter);
        });
    }

}
