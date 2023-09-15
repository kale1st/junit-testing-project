package com.azizkale.junittestingproject.package1;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class ExampleTestMethodOrder {
    @Test
    @Order(2)
    public void testSecond() {
        System.out.println("second test completed!");
    }

    @Test
    @Order(1)
    public void testFirst() {
        System.out.println("first test completed!");
    }
}
