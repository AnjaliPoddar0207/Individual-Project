package com.sjsu.anjali.ccproject;

import com.sjsu.anjali.ccproject.fileReaderWriter.CSVFile;
import com.sjsu.anjali.ccproject.fileReaderWriter.JsonFile;
import com.sjsu.anjali.ccproject.fileReaderWriter.XmlFile;

public class MainExecutor {

    public static void main(String[] args) throws Exception {
        CSVFile c = new CSVFile();
        c.readCSV("creditCardData.csv");
        c.writeCSV("creditCardDataOutput.csv");

        JsonFile j = new JsonFile();
        j.readJSON("creditCardData.json");
        j.writeJSON("creditCardDataOutput.json");

        XmlFile x = new XmlFile();
        x.readXMl("creditCardData.xml");
        x.writeXML("creditCardDataOutput.xml");
    }
}
