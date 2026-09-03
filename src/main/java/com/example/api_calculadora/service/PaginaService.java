package com.example.api_calculadora.service;

import org.springframework.stereotype.Service;

@Service
public class PaginaService {
	
	public static double somar (double num1, double num2) {
	return num1 + num2;
}

	public static double subtracao(double num1, double num2) {
		return num1 - num2;
	}
	
	public static double multiplicacao(double num1, double num2) {
		return num1 * num2;
	}

	public static double divisao(double num1, double num2) {
		if (num2 == 0) {
			return 0;
		}
		return num1 / num2;
	}
}
