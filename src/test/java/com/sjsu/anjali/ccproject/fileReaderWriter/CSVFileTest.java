package com.sjsu.anjali.ccproject.fileReaderWriter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class CSVFileTest {

    private CSVFile csvFileUnderTest;

    @Before
    public void setUp() {
        csvFileUnderTest = new CSVFile();
    }

    @Test
    public void testReadCSV() throws Exception {
        // Setup

        // Run the test
        csvFileUnderTest.readCSV("creditOutputSample.csv");

        // Verify the results
    }

    @Test
    public void testReadCSV_ThrowsException() {
        // Setup

        // Run the test
        assertThrows(Exception.class, () -> csvFileUnderTest.readCSV("creditOutputSample.csv"));
    }

    @Test
    public void testWriteCSV() throws Exception {
        // Setup

        // Run the test
        csvFileUnderTest.writeCSV("creditOutputSample.csv");

        // Verify the results
    }

    @Test
    public void testWriteCSV_ThrowsException() {
        // Setup

        // Run the test
        assertThrows(Exception.class, () -> csvFileUnderTest.writeCSV("creditOutputSample.csv"));
    }
}
