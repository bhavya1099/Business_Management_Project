package com.business.entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Admin_setAdminId_a83a201657_Test {

    private Admin admin;

    @BeforeEach
    public void setUp() {
        admin = new Admin();
    }

    @Test
    public void testSetAdminIdPositive() {
        int expectedAdminId = 1234;
        admin.setAdminId(expectedAdminId);
        assertEquals(expectedAdminId, admin.getAdminId());
    }

    @Test
    public void testSetAdminIdZero() {
        int expectedAdminId = 0;
        admin.setAdminId(expectedAdminId);
        assertEquals(expectedAdminId, admin.getAdminId());
    }
}
