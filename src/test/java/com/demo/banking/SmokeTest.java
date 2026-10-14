package com.demo.banking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Trivial always-passing test used to generate a fresh commit + CI run so Smart Tests'
 * GitHub App collects an in-window commit for observation-mode data collection.
 */
class SmokeTest {

    @Test
    void smoke() {
        assertEquals(2, 1 + 1);
    }
}
