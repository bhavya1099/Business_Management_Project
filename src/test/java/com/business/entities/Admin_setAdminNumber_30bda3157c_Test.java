package com.business.entities;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Admin_setAdminNumber_30bda3157c_Test {

    @Test
    public void testSetAdminNumber() {
        Admin admin = new Admin();
        String adminNumber = "1234567890";
        admin.setAdminNumber(adminNumber);
        assertEquals(adminNumber, admin.getAdminNumber());
    }

    @Test
    public void testSetAdminNumberWithNull() {
        Admin admin = new Admin();
        admin.setAdminNumber(null);
        assertEquals(null, admin.getAdminNumber());
    }
}
