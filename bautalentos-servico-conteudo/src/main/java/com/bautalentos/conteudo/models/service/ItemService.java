package com.bautalentos.conteudo.models.service;

import java.util.List;

import com.bautalentos.conteudo.models.Item;

public interface ItemService {

	public List<Item> findAll();
	
	public Item findById(Long id);
}
