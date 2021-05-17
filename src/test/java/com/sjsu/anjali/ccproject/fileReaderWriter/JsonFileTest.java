package com.sjsu.anjali.ccproject.fileReaderWriter;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertThrows;

public class JsonFileTest {

    private JsonFile jsonFileUnderTest;

    @Before
    public void setUp() {
        jsonFileUnderTest = new JsonFile();
    }

    @Test
    public void testReadJSON() throws Exception {
        // Setup

        // Run the test
        jsonFileUnderTest.readJSON("creditOutputSample.json");

        // Verify the results
    }

    @Test
    public void testReadJSON_ThrowsIOException() {
        // Setup

        // Run the test
        assertThrows(IOException.class, () -> jsonFileUnderTest.readJSON("creditOutputSample.json"));
    }

    @Test
    public void testReadJSON_ThrowsIllegalAccessException() {
        // Setup

        // Run the test
        assertThrows(IllegalAccessException.class, () -> jsonFileUnderTest.readJSON("creditOutputSample.json"));
    }

    @Test
    public void testWriteJSON() throws Exception {
        // Setup

        // Run the test
        jsonFileUnderTest.writeJSON("creditOutputSample.json");

        // Verify the results
    }

    @Test
    public void testWriteJSON_ThrowsIOException() {
        // Setup

        // Run the test
        assertThrows(IOException.class, () -> jsonFileUnderTest.writeJSON("creditOutputSample.json"));
    }

    @Test
    public void testWriteJSON_ThrowsIllegalAccessException() {
        // Setup

        // Run the test
        assertThrows(IllegalAccessException.class, () -> jsonFileUnderTest.writeJSON("creditOutputSample.json"));
    }
}
