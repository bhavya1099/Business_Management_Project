package com.business.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Orders_getoId_0c6e105fbb_Test {

    private Orders orders;

    @BeforeEach
    public void setUp() {
        orders = new Orders();
    }

    @Test
    public void testGetoId() {
        int expectedOId = 101;
        orders.setoId(expectedOId);
        int actualOId = orders.getoId();
        assertEquals(expectedOId, actualOId, "Returned Order ID doesn't match the expected value");
    }

    @Test
    public void testGetoId_NotSet() {
        int actualOId = orders.getoId();
        assertNotNull(actualOId, "Returned Order ID is null but expected default value");
    }
}
