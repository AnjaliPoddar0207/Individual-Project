package com.sjsu.anjali.ccproject.data;

import org.junit.Before;

public class MasterCCTest {

    private MasterCC masterCCUnderTest;

    @Before
    public void setUp() {
        masterCCUnderTest = new MasterCC("number", "holder", "date", "type");
    }
}
