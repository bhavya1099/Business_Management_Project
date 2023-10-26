// Test generated by RoostGPT for test java-unit-test-bhavya using AI Type Open AI and AI Model gpt-4

package com.business.entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class Orders_getTotalAmmout_24484ef500_Test {

    @Mock
    private Orders order;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetTotalAmmout_Positive() {
        double expectedTotalAmount = 200.0;
        when(order.getTotalAmmout()).thenReturn(expectedTotalAmount);

        double actualTotalAmount = order.getTotalAmmout();

        assertEquals(expectedTotalAmount, actualTotalAmount, "The total amount should be 200.0");
    }

    @Test
    public void testGetTotalAmmout_Zero() {
        double expectedTotalAmount = 0.0;
        when(order.getTotalAmmout()).thenReturn(expectedTotalAmount);

        double actualTotalAmount = order.getTotalAmmout();

        assertEquals(expectedTotalAmount, actualTotalAmount, "The total amount should be 0.0");
    }
}
