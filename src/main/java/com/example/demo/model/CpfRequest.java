package com.example.demo.model;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class CpfRequest {

    @NotBlank(message = "O CPF não pode estar vazio.")
    @Pattern(regexp = "\\d{11}", message = "O CPF deve conter exatamente 11 dígitos numéricos.")
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

