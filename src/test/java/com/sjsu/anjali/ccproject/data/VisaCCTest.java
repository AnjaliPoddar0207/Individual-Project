package com.sjsu.anjali.ccproject.data;

import org.junit.Before;

public class VisaCCTest {

    private VisaCC visaCCUnderTest;

    @Before
    public void setUp() {
        visaCCUnderTest = new VisaCC("number", "holder", "date", "type");
    }
}
