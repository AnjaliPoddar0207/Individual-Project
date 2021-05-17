package com.sjsu.anjali.ccproject;

import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class MainExecutorTest {

    @Test
    public void testMain() throws Exception {
        // Setup

        // Run the test
        MainExecutor.main(new String[]{"value"});

        // Verify the results
    }

    @Test
    public void testMain_ThrowsException() {
        // Setup

        // Run the test
        assertThrows(Exception.class, () -> MainExecutor.main(new String[]{"value"}));
    }
}
