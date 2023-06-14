package org.example;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
@ToString
public class StationInformation {
    List<Station> stations = new ArrayList<>();
    private static final WebPageParsing webPageParsing = new WebPageParsing();
    private static final ParseJson parseJson = new ParseJson();


    public void parsing()throws Exception{
        webPageParsing.addedLinesMetro();
        webPageParsing.addedStationMetro();
        webPageParsing.addedTransition();
        parseJson.parseJson();

    }

    public List<Station> addedInformation()throws Exception{
        parsing();
        webPageParsing.stationsAndNumberLinesList.forEach(station -> {
            Station stationObject = new Station();
            for (int i = 0; i < webPageParsing.linesMoscowMetroList.size(); i++) {
                if(station.getNumberLines().equals(webPageParsing.linesMoscowMetroList.get(i).getNumberLines())){
                    stationObject.setNameLine(webPageParsing.linesMoscowMetroList.get(i).getName());
                    stationObject.setName(station.getName());
                    break;
                }
            }

            for (int i = 0; i < parseJson.metro.size(); i++) {
                if(station.getName().equals(parseJson.metro.get(i).getStation_name())){
                    stationObject.setDepth(parseJson.metro.get(i).getDepth());
                    break;
                }
            }


            for (int i = 1; i < webPageParsing.transitioList.size() ; i++) {
                String s = webPageParsing.transitioList.get(i).toString();
                if (station.getName().equals(s)){
                    stationObject.setTransition(true);
                    break;
                }
            }

            stations.add(stationObject);
        });
        return stations;
    }
}
