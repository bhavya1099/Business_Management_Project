package com.business.entities;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Orders_setoQuantity_248ccada39_Test {

    private Orders orders;

    @BeforeEach
    public void setUp() {
        orders = new Orders();
    }

    @Test
    public void testSetoQuantity_PositiveValue() {
        int testQuantity = 5;
        orders.setoQuantity(testQuantity);
        assertEquals(testQuantity, orders.getoQuantity());
    }

    @Test
    public void testSetoQuantity_ZeroValue() {
        int testQuantity = 0;
        orders.setoQuantity(testQuantity);
        assertEquals(testQuantity, orders.getoQuantity());
    }
}
