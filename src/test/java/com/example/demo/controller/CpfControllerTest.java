package com.example.demo.controller;

import com.example.demo.model.CpfRequest;
import com.example.demo.model.CpfResponse;
import com.example.demo.service.CpfService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CpfControllerTest {

    @Mock
    private CpfService cpfService;

    @InjectMocks
    private CpfController cpfController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void shouldReturnValidResponseForValidCpf() {
        CpfRequest request = new CpfRequest();
        request.setCpf("52998224725");

        when(cpfService.validateCpf("52998224725")).thenReturn(true);

        ResponseEntity<CpfResponse> response = cpfController.validateCpf(request);

        assertEquals(200, response.getStatusCodeValue());
        assertTrue(response.getBody().isValid());
    }

    @Test
    void shouldReturnInvalidResponseForInvalidCpf() {
        CpfRequest request = new CpfRequest();
        request.setCpf("12345678900");

        when(cpfService.validateCpf("12345678900")).thenReturn(false);

        ResponseEntity<CpfResponse> response = cpfController.validateCpf(request);

        assertEquals(200, response.getStatusCodeValue());
        assertFalse(response.getBody().isValid());
    }
}
