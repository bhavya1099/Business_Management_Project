// Test generated by RoostGPT for test java-unit-test-bhavya using AI Type Open AI and AI Model gpt-4

package com.business.entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class Orders_getoPrice_5561eedf69_Test {

    @InjectMocks
    private Orders orders;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        orders.setoPrice(100.00);
    }

    @Test
    public void testGetoPrice_Positive() {
        double expected = 100.00;
        double actual = orders.getoPrice();
        assertEquals(expected, actual, "Expected and actual values should be the same");
    }

    @Test
    public void testGetoPrice_Negative() {
        double unexpected = 200.00;
        double actual = orders.getoPrice();
        assertNotEquals(unexpected, actual, "Expected and actual values should be different");
    }
}
