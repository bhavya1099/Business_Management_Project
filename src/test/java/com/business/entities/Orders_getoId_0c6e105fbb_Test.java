// Test generated by RoostGPT for test java-unit-test-bhavya using AI Type Open AI and AI Model gpt-4

package com.business.entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class Orders_getoId_0c6e105fbb_Test {

    @MockBean
    private Orders orders;

    @BeforeEach
    public void setUp() {
        orders = new Orders();
    }

    @Test
    public void testGetoId_whenIdIsSet() {
        int expectedId = 5;
        orders.setoId(expectedId);

        int actualId = orders.getoId();
        assertEquals(expectedId, actualId, "The expected Id does not match the actual Id.");
    }

    @Test
    public void testGetoId_whenIdIsNotSet() {
        int defaultId = 0;

        int actualId = orders.getoId();
        assertEquals(defaultId, actualId, "The expected Id does not match the actual Id.");
    }
}
