// Test generated by RoostGPT for test java-unit-test-bhavya using AI Type Open AI and AI Model gpt-4

package com.business.entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Admin_setAdminPassword_26e40ce4d3_Test {
    private Admin admin;

    @BeforeEach
    void setUp() {
        admin = new Admin();
    }

    @Test
    void testSetAdminPassword_ValidPassword() {
        String password = "validPassword123";
        admin.setAdminPassword(password);
        assertEquals(password, admin.getAdminPassword());
    }

    @Test
    void testSetAdminPassword_NullPassword() {
        String password = null;
        admin.setAdminPassword(password);
        assertNull(admin.getAdminPassword());
    }

    @Test
    void testSetAdminPassword_EmptyPassword() {
        String password = "";
        admin.setAdminPassword(password);
        assertEquals(password, admin.getAdminPassword());
    }
}