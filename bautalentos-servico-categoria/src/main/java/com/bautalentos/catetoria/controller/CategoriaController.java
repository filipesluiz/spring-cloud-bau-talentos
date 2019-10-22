package com.bautalentos.catetoria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bautalentos.catetoria.models.entity.Categoria;
import com.bautalentos.catetoria.models.service.CategoriaService;

@RestController
public class CategoriaController {

	@Autowired
	private CategoriaService service;
	
	@GetMapping("/listar")
	public List<Categoria> listar(){
		return service.findAll();
	}
	
	@GetMapping("/listar/{id}")
	public Categoria obter(@PathVariable Long id) {
		return service.findById(id);
	}
}
