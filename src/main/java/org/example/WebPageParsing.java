package org.example;

import lombok.Getter;
import lombok.Setter;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter

public class WebPageParsing {

    private String code;
    List<LinesMoscowMetro> linesMoscowMetroList = new ArrayList<>();
    List<StationsAndNumberLines> stationsAndNumberLinesList = new ArrayList<>();
    List<String> transitioList = new ArrayList<>();


    public Document gettingHtmlCode() throws Exception{
        String url = "https://skillbox-java.github.io/";
         Document doc = Jsoup.connect(url).get();
         return doc;
    }

    public List addedLinesMetro()throws Exception{
        Elements lines = gettingHtmlCode().select("span[class*='js-metro-line']");
        for (Element line: lines){
            LinesMoscowMetro linesMoscowMetro = new LinesMoscowMetro();
            linesMoscowMetro.setName(line.text());
            linesMoscowMetro.setNumberLines(line.attr("data-line"));
            linesMoscowMetroList.add(linesMoscowMetro);

        }
        return linesMoscowMetroList;
    }

    public List<StationsAndNumberLines> addedStationMetro() throws Exception {
        Elements elements = gettingHtmlCode().select("div[class*='js-depend']");
        for (Element e : elements) {
            Elements elemens = e.select("span[class*='name']");
            for (Element i : elemens) {
                StationsAndNumberLines stationsAndNumberLines = new StationsAndNumberLines();
                stationsAndNumberLines.setName(i.text());
                stationsAndNumberLines.setNumberLines(e.attr("data-depend-set").
                        replaceAll("lines-", ""));
                stationsAndNumberLinesList.add(stationsAndNumberLines);
            }

        }
        return stationsAndNumberLinesList;
    }

    public List addedTransition() throws Exception{
        List<String> textTransition = new ArrayList<>();
        Elements elements = gettingHtmlCode().select("span[class*='t-icon-metroln']");
        elements.forEach(e -> { textTransition.add(e.attr("title"));
        });
        for (int i = 0; i < textTransition.size(); i++) {
            String start = "«";
            int starting = textTransition.get(i).indexOf(start) + start.length();
            int end = textTransition.get(i).indexOf("»",starting);
            if (end == -1){
                end = 0;
            }
            String finish = textTransition.get(i).substring(starting,end);
            transitioList.add(finish);
        }
        return transitioList;
    }



}
