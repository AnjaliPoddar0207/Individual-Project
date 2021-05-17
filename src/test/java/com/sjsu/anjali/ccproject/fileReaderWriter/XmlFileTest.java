package com.sjsu.anjali.ccproject.fileReaderWriter;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertThrows;

public class XmlFileTest {

    private XmlFile xmlFileUnderTest;

    @Before
    public void setUp() {
        xmlFileUnderTest = new XmlFile();
    }

    @Test
    public void testReadXMl() throws Exception {
        // Setup

        // Run the test
        xmlFileUnderTest.readXMl("creditOutputSample.xml");

        // Verify the results
    }

    @Test
    public void testReadXMl_ThrowsIOException() {
        // Setup

        // Run the test
        assertThrows(IOException.class, () -> xmlFileUnderTest.readXMl("creditOutputSample.xml"));
    }

    @Test
    public void testReadXMl_ThrowsIllegalAccessException() {
        // Setup

        // Run the test
        assertThrows(IllegalAccessException.class, () -> xmlFileUnderTest.readXMl("creditOutputSample.xml"));
    }

    @Test
    public void testWriteXML() throws Exception {
        // Setup

        // Run the test
        xmlFileUnderTest.writeXML("creditOutputSample.xml");

        // Verify the results
    }

    @Test
    public void testWriteXML_ThrowsException() {
        // Setup

        // Run the test
        assertThrows(Exception.class, () -> xmlFileUnderTest.writeXML("creditOutputSample.xml"));
    }
}
