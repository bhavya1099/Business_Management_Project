package com.business.entities;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class Orders_setUser_e2a2590c5f_Test {

    @InjectMocks
    private Orders orders;

    @Mock
    private User user;

    public Orders_setUser_e2a2590c5f_Test() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSetUser_NullUser() {
        orders.setUser(null);
        assertNull(orders.getUser());
    }

    @Test
    public void testSetUser_ValidUser() {
        when(user.getU_id()).thenReturn(1);
        when(user.getUname()).thenReturn("TestUser");
        when(user.getUemail()).thenReturn("testuser@example.com");
        when(user.getUpassword()).thenReturn("testpassword");
        when(user.getUnumber()).thenReturn(1234567890L);

        orders.setUser(user);
        assertNotNull(orders.getUser());
        assertEquals(1, orders.getUser().getU_id());
        assertEquals("TestUser", orders.getUser().getUname());
        assertEquals("testuser@example.com", orders.getUser().getUemail());
        assertEquals("testpassword", orders.getUser().getUpassword());
        assertEquals(1234567890L, orders.getUser().getUnumber());
    }
}
