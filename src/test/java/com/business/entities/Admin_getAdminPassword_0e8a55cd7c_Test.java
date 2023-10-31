package com.business.entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class Admin_getAdminPassword_0e8a55cd7c_Test {

    private Admin admin;

    @BeforeEach
    public void setUp() {
        admin = new Admin();
        admin.setAdminId(1);
        admin.setAdminName("John");
        admin.setAdminEmail("john@gmail.com");
        admin.setAdminPassword("john123");
        admin.setAdminNumber("1234567890");
    }

    @Test
    public void testGetAdminPassword() {
        assertEquals("john123", admin.getAdminPassword());
    }

    @Test
    public void testGetAdminPassword_Failure() {
        assertNotEquals("john124", admin.getAdminPassword());
    }
}
