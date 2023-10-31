package com.business.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Orders_setTotalAmmout_3753813e80_Test {

    @Test
    public void testSetTotalAmount_Positive() {
        Orders order = new Orders();
        double expected = 500.0;
        order.setTotalAmmout(expected);
        Assertions.assertEquals(expected, order.getTotalAmmout(), "The total amount set does not match the expected total amount");
    }

    @Test
    public void testSetTotalAmount_Negative() {
        Orders order = new Orders();
        double expected = -500.0;
        order.setTotalAmmout(expected);
        Assertions.assertEquals(expected, order.getTotalAmmout(), "The total amount set does not match the expected total amount");
    }

    @Test
    public void testSetTotalAmount_Zero() {
        Orders order = new Orders();
        double expected = 0.0;
        order.setTotalAmmout(expected);
        Assertions.assertEquals(expected, order.getTotalAmmout(), "The total amount set does not match the expected total amount");
    }
}
