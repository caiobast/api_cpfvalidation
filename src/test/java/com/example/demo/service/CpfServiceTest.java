package com.example.demo.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CpfServiceTest {

    private final CpfService cpfService = new CpfService();

    @Test
    void shouldReturnTrueForValidCpf() {
        assertTrue(cpfService.validateCpf("52998224725"));
    }

    @Test
    void shouldReturnFalseForInvalidCpf() {
        assertFalse(cpfService.validateCpf("12345678900"));
    }

    @Test
    void shouldReturnFalseForEmptyCpf() {
        assertFalse(cpfService.validateCpf(""));
    }
}

