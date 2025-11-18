package com.es.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.es.service.IExtranjeroService;

@Controller
public class ExtranjeroController {
	@Autowired
	private IExtranjeroService extranjeroService;
	
	@GetMapping("/")
	private String Inicio(Model model) {
		model.addAttribute("extranjero", extranjeroService.ListarExtranjeros() );
		return "inicio";		
	}
	
}
