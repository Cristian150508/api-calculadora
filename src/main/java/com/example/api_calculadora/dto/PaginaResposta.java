package com.example.api_calculadora.dto;

public class PaginaResposta {
	
	private double num1;
	private double num2;
	private String operador;
	private double resultado;
	
	public PaginaResposta(double num1, double num2, String operador, double resultado) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.operador = operador;
		this.resultado = resultado;
	}
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	public String getOperador() {
		return operador;
	}
	public void setOperador(String operador) {
		this.operador = operador;
	}
	public double getResultado() {
		return resultado;
	}
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	

}
