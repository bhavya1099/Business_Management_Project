// Test generated by RoostGPT for test java-unit-test-bhavya using AI Type Open AI and AI Model gpt-4

package com.business.entities;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class Admin_toString_ceffa8036e_Test {

    @Test
    public void testToString() {
        Admin admin = new Admin();
        admin.setAdminId(1);
        admin.setAdminName("John Doe");
        admin.setAdminEmail("john.doe@example.com");
        admin.setAdminPassword("password");
        admin.setAdminNumber("1234567890");

        String expectedOutput = "Admin [adminId=1, adminName=John Doe, adminEmail=john.doe@example.com, adminPassword=password, adminNumber=1234567890]";
        assertEquals(expectedOutput, admin.toString());
    }

    @Test
    public void testToStringWithEmptyFields() {
        Admin admin = new Admin();

        String expectedOutput = "Admin [adminId=0, adminName=null, adminEmail=null, adminPassword=null, adminNumber=null]";
        assertEquals(expectedOutput, admin.toString());
    }
}
