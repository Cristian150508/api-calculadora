package com.example.api_calculadora.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.example.api_calculadora.service.PaginaService;

@RestController
public class PaginaController {


	@Autowired
	PaginaService servico;
	
}