package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class LineList {

    private static final WebPageParsing webPageParsing = new WebPageParsing();
    private final List<String> one = new ArrayList<>();
    private final List<String> two = new ArrayList<>();
    private final List<String> three = new ArrayList<>();
    private final List<String> four = new ArrayList<>();
    private final List<String> five = new ArrayList<>();
    private final List<String> six = new ArrayList<>();
    private final List<String> seven = new ArrayList<>();
    private final List<String> eight = new ArrayList<>();
    private final List<String> nine = new ArrayList<>();
    private final List<String> ten = new ArrayList<>();
    private final List<String> eleven = new ArrayList<>();
    private final List<String> elevenA = new ArrayList<>();
    private final List<String> twelve = new ArrayList<>();

    private final List<String> fourteen = new ArrayList<>();
    private final List<String> fifteen = new ArrayList<>();
    private final List<String> d1 = new ArrayList<>();
    private final List<String> d2 = new ArrayList<>();

    public void addedObjectLine()throws Exception{
        webPageParsing.addedStationMetro();

        for (int i = 0; i <webPageParsing.stationsAndNumberLinesList.size() ; i++) {

            switch (webPageParsing.stationsAndNumberLinesList.get(i).getNumberLines()) {
                case ("1") -> one.add(webPageParsing.stationsAndNumberLinesList.get(i).getName());
                case ("2") -> two.add(webPageParsing.stationsAndNumberLinesList.get(i).getName());
                case ("3") -> three.add(webPageParsing.stationsAndNumberLinesList.get(i).getName());
                case ("4") -> four.add(webPageParsing.stationsAndNumberLinesList.get(i).getName());
                case ("5") -> five.add(webPageParsing.stationsAndNumberLinesList.get(i).getName());
                case ("6") -> six.add(webPageParsing.stationsAndNumberLinesList.get(i).getName());
                case ("7") -> seven.add(webPageParsing.stationsAndNumberLinesList.get(i).getName());
                case ("8") -> eight.add(webPageParsing.stationsAndNumberLinesList.get(i).getName());
                case ("9") -> nine.add(webPageParsing.stationsAndNumberLinesList.get(i).getName());
                case ("10") -> ten.add(webPageParsing.stationsAndNumberLinesList.get(i).getName());
                case ("11") -> eleven.add(webPageParsing.stationsAndNumberLinesList.get(i).getName());
                case ("11A") -> elevenA.add(webPageParsing.stationsAndNumberLinesList.get(i).getName());
                case ("12") -> twelve.add(webPageParsing.stationsAndNumberLinesList.get(i).getName());
                case ("14") -> fourteen.add(webPageParsing.stationsAndNumberLinesList.get(i).getName());
                case ("15") -> fifteen.add(webPageParsing.stationsAndNumberLinesList.get(i).getName());
                case ("D1") -> d1.add(webPageParsing.stationsAndNumberLinesList.get(i).getName());
                case ("D2") -> d2.add(webPageParsing.stationsAndNumberLinesList.get(i).getName());
            }
        }
    }
}
