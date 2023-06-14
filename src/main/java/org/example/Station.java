package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter

public class Station {

    String name;
    String nameLine;
    String depth;
    boolean transition = false;

    @Override
    public String toString() {
        return name + " " + nameLine + " " + depth + " " + transition;
    }


    //    public void parsing()throws Exception{
//        webPageParsing.addedLinesMetro();
//        webPageParsing.addedStationMetro();
//        parseJson.parseJson();
//        webPageParsing.addedTransition();
//    }

//    public void gettingNameAndNameLine()throws Exception{
//        parsing();
//        webPageParsing.stationMoscowMetroList.forEach(station -> {
//            webPageParsing.linesMoscowMetroList.forEach(line -> {
//                if(station.getNumberLines().equals(line.getNumberLines())){
//                    setNameLine(line.getName());
//                    setName(station.getName());
//                }
//            });
//        });
//    }

//    public void gettingDepth()throws Exception{
//        parsing();
//        webPageParsing.stationMoscowMetroList.forEach(station ->{
//            parseJson.metro.forEach(metroDepth -> {
//                if(station.getName().equals(metroDepth.getStation_name())){
//
//                    setDepth(metroDepth.getDepth());
//                }
//            });
//        });
//    }

//    public void gettingTransition()throws Exception{
//        parsing();
//        webPageParsing.transitioList.forEach(list -> {
//            webPageParsing.stationMoscowMetroList.forEach(station ->
//            {
//                if(list.equals(station.getName())){
//
//                    setTransition(true);
//                }
//            });
//        });
//    }


}
