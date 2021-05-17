package com.sjsu.anjali.ccproject.data;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {

    private CreditCard creditCardUnderTest;

    @Before
    public void setUp() {
        creditCardUnderTest = new CreditCard("number", "holder", "date", "type");
    }

    @Test
    public void testSetType() {
        // Setup

        // Run the test
        creditCardUnderTest.setType("type");

        // Verify the results
    }

    @Test
    public void testGetType() {
        // Setup

        // Run the test
        final String result = creditCardUnderTest.getType();

        // Verify the results
        assertEquals("result", result);
    }

    @Test
    public void testPrint() {
        // Setup

        // Run the test
        creditCardUnderTest.print();

        // Verify the results
    }
}
