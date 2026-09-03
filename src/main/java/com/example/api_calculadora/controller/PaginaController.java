package com.example.api_calculadora.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.api_calculadora.dto.PaginaRequisicao;
import com.example.api_calculadora.dto.PaginaResposta;
import com.example.api_calculadora.service.PaginaService;

@RestController
public class PaginaController {

    @PostMapping("/Calculadora/somar")
	public PaginaResposta somar (@RequestBody PaginaRequisicao requisicao) {
		
		double resultado = PaginaService.somar (
				requisicao.getNum1(),
				requisicao.getNum2()
);
		return new PaginaResposta (
				requisicao.getNum1(),
				requisicao.getNum2(),
				"soma",
				resultado
				);
	}
	@PostMapping("/Calculadora/subtracao")
	public PaginaResposta subtracao (@RequestBody PaginaRequisicao requisicao) {
		
		double resultado = PaginaService.subtracao (
				requisicao.getNum1(),
				requisicao.getNum2()
				);
		return new PaginaResposta (
				requisicao.getNum1(),
				requisicao.getNum2(),
				"subtração",
				resultado
				);
	}
	@PostMapping("/Calculadora/multiplicacao")
	public PaginaResposta multiplicacao (@RequestBody PaginaRequisicao requisicao) {
		
		double resultado = PaginaService.multiplicacao (
				requisicao.getNum1(),
				requisicao.getNum2()
				);
		return new PaginaResposta (
				requisicao.getNum1(),
				requisicao.getNum2(),
				"multiplicacao",
				resultado
				);
	
	}
	@PostMapping("/Calculadora/divisao")
	public PaginaResposta divisao (@RequestBody PaginaRequisicao requisicao) {
		
		double resultado = PaginaService.divisao (
				requisicao.getNum1(),
				requisicao.getNum2()
				);
		return new PaginaResposta (
				requisicao.getNum1(),
				requisicao.getNum2(),
				"subtração",
				resultado
				);
}
}