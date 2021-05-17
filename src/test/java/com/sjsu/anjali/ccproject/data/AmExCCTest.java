package com.sjsu.anjali.ccproject.data;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AmExCCTest {

    private AmExCC amExCCUnderTest;

    @Before
    public void setUp() {
        amExCCUnderTest = new AmExCC("number", "holder", "date", "type");
    }

    @Test
    public void testGetType() {
        // Setup

        // Run the test
        final String result = amExCCUnderTest.getType();

        // Verify the results
        assertEquals("result", result);
    }
}
