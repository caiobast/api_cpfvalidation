package com.example.demo.controller;

import com.example.demo.model.CpfRequest;
import com.example.demo.model.CpfResponse;
import com.example.demo.service.CpfService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/v1")
@Validated
public class CpfController {

    private final CpfService cpfService;

    public CpfController(CpfService cpfService) {
        this.cpfService = cpfService;
    }

    @PostMapping("/validate-cpf")
    public ResponseEntity<CpfResponse> validateCpf(@RequestBody @Valid CpfRequest request) {
        boolean isValid = cpfService.validateCpf(request.getCpf());
        return ResponseEntity.ok(new CpfResponse(request.getCpf(), isValid));
    }
}

