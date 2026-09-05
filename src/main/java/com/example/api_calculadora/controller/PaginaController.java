package com.example.api_calculadora.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.api_calculadora.dto.PaginaRequisicao;
import com.example.api_calculadora.dto.PaginaResposta;
import com.example.api_calculadora.service.PaginaService;
@RestController
@RequestMapping("/Calculadora")
public class PaginaController {

    private final PaginaService paginaService;
    
    @Autowired
    public PaginaController(PaginaService paginaService) {
        this.paginaService = paginaService;
    }

    @PostMapping("/somar")
	public PaginaResposta somar (@RequestBody PaginaRequisicao requisicao) {
		
    	double resultado = paginaService.somar(
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
	@PostMapping("/subtracao")
	public PaginaResposta subtracao (@RequestBody PaginaRequisicao requisicao) {
		
		double resultado = paginaService.subtracao (
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
	@PostMapping("/multiplicacao")
	public PaginaResposta multiplicacao (@RequestBody PaginaRequisicao requisicao) {
		
		double resultado = paginaService.multiplicacao (
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
	@PostMapping("/divisao")
	public PaginaResposta divisao (@RequestBody PaginaRequisicao requisicao) {
		
		double resultado = paginaService.dividir (
				requisicao.getNum1(),
				requisicao.getNum2()
				);
		return new PaginaResposta (
				requisicao.getNum1(),
				requisicao.getNum2(),
				"divisao",
				resultado
				);
	  
     
    }
}