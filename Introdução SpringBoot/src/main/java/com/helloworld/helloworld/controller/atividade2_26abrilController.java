package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atividadementalidade2")

public class atividade2_26abrilController {
	
	@GetMapping
	
	public String mentalidades() {
		return "OBJETIVOS\n1. Aprender novos comandos;\n2. Desenvolver o projeto integrador;\n"
				+ "3.Ter paciência";
	}
	
}