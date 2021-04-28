package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atividadementalidade")

public class atividade1_26abrilController {
	
	@GetMapping
	
	public String mentalidades() {
		return "1. Atenção aos detalhes\n2. Persistência\n3. Trabalho em equipe";
	}
	
}
