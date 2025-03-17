package com.example.demo.util;

public class CpfValidador {

    public static boolean isValidCpf(String cpf) {
        if (cpf == null || cpf.length() != 11 || cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        int sum = 0, remainder;
        for (int i = 1; i <= 9; i++) {
            sum += Character.getNumericValue(cpf.charAt(i - 1)) * (11 - i);
        }
        remainder = (sum * 10) % 11;
        if (remainder == 10) remainder = 0;
        if (remainder != Character.getNumericValue(cpf.charAt(9))) return false;

        sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += Character.getNumericValue(cpf.charAt(i - 1)) * (12 - i);
        }
        remainder = (sum * 10) % 11;
        if (remainder == 10) remainder = 0;
        return remainder == Character.getNumericValue(cpf.charAt(10));
    }
}
