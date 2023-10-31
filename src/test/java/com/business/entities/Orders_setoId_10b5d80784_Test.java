package com.business.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class Orders_setoId_10b5d80784_Test {

    private Orders order;

    @BeforeEach
    public void setUp() {
        order = new Orders();
    }

    @Test
    public void testSetoIdPositive() {
        int expectedId = 123;
        order.setoId(expectedId);
        assertEquals(expectedId, order.getoId());
    }

    @Test
    public void testSetoIdNegative() {
        int expectedId = -123;
        order.setoId(expectedId);
        assertEquals(expectedId, order.getoId());
    }
}
