package com.example.demo.service;


import com.example.demo.util.CpfValidador;
import org.springframework.stereotype.Service;

@Service
public class CpfService {

    public boolean validateCpf(String cpf) {
        return CpfValidador.isValidCpf(cpf);
    }
}
