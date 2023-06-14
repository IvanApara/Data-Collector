package org.example;

import com.opencsv.CSVReader;

import java.io.FileReader;

public class ParseCSV {
    public void parseCSV() throws Exception {
        FileReader filereader = new FileReader("data/dates-2.csv");
        CSVReader csvReader = new CSVReader(filereader);
        String[] nextRecord;
        while ((nextRecord = csvReader.readNext()) != null) {
            for (String cell : nextRecord) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
    }
}
