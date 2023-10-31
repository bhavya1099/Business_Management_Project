package com.business.entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Admin_toString_ceffa8036e_Test {

    private Admin admin;

    @BeforeEach
    public void setUp() {
        admin = new Admin();
        admin.setAdminId(1);
        admin.setAdminName("John Doe");
        admin.setAdminEmail("johndoe@example.com");
        admin.setAdminPassword("password123");
        admin.setAdminNumber("1234567890");
    }

    @Test
    public void testToString() {
        String expected = "Admin [adminId=1, adminName=John Doe, adminEmail=johndoe@example.com, adminPassword=password123, adminNumber=1234567890]";
        String actual = admin.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testToStringWhenAdminDetailsAreNotSet() {
        Admin newAdmin = new Admin();
        String expected = "Admin [adminId=0, adminName=null, adminEmail=null, adminPassword=null, adminNumber=null]";
        String actual = newAdmin.toString();
        assertEquals(expected, actual);
    }
}
