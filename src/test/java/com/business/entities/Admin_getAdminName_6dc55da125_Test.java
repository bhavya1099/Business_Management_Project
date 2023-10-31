package com.business.entities;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Admin_getAdminName_6dc55da125_Test {

    @Test
    public void testGetAdminNameSuccess() {
        // Create a new Admin object
        Admin admin = new Admin();
        // Set the adminName
        admin.setAdminName("John Doe");
        // Test the getAdminName method
        assertEquals("John Doe", admin.getAdminName(), "Admin name should be John Doe");
    }

    @Test
    public void testGetAdminNameFailure() {
        // Create a new Admin object
        Admin admin = new Admin();
        // Do not set the adminName
        // Test the getAdminName method
        assertEquals(null, admin.getAdminName(), "Admin name should be null");
    }
}
