package com.ems;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmsApplicationTests {

    @Test
    void contextLoads() {

        String name = "Saloni";

        assertEquals("Saloni", name);
    }
}