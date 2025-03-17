package com.example.demo.model;

public class CpfResponse {
    private String cpf;
    private boolean valid;

    public CpfResponse(String cpf, boolean valid) {
        this.cpf = cpf;
        this.valid = valid;
    }

    public String getCpf() {
        return cpf;
    }

    public boolean isValid() {
        return valid;
    }
}

