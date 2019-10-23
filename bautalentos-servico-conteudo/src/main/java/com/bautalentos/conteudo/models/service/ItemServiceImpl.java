package com.bautalentos.conteudo.models.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bautalentos.conteudo.models.Categoria;
import com.bautalentos.conteudo.models.Item;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private RestTemplate cliente;
	
	@Override
	public List<Item> findAll() {
		List<Categoria> categorias = Arrays.asList(cliente.getForObject("http://localhost:8001/listar", Categoria[].class));
		return categorias.stream().map(c -> new Item(c, 1l)).collect(Collectors.toList());
	}

	@Override
	public Item findById(Long id) {
		Categoria categoria = cliente.getForObject("http://localhost:8001/listar/{id}", Categoria.class, id);
		return new Item(categoria, 1l);
	}

}
