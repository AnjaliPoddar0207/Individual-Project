package com.sjsu.anjali.ccproject.factory;

import com.sjsu.anjali.ccproject.data.CreditCard;
import org.junit.Before;
import org.junit.Test;

public class CreditCardFactoryTest {

    private CreditCardFactory creditCardFactoryUnderTest;

    @Before
    public void setUp() {
        creditCardFactoryUnderTest = new CreditCardFactory();
    }

    @Test
    public void testCreateCard() {
        // Setup

        // Run the test
        final CreditCard result = creditCardFactoryUnderTest.createCard("number", "cardHolder", "expirationDate");

        // Verify the results
    }

    @Test
    public void testSetType() {
        // Setup

        // Run the test
        creditCardFactoryUnderTest.setType("type");

        // Verify the results
    }
}
