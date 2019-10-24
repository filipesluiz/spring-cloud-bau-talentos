package com.bautalentos.conteudo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bautalentos.conteudo.models.Item;
import com.bautalentos.conteudo.models.service.ItemService;

@RestController
public class ConteudoController {

	@Autowired
	@Qualifier("serviceFeigh")
	private ItemService itemService;
	
	@GetMapping("/listar")
	public List<Item> listar(){
		return itemService.findAll();
	}
	
	@GetMapping("/listar/{id}")
	public Item detalhe(@PathVariable Long id) {
		return itemService.findById(id);
	}
}
