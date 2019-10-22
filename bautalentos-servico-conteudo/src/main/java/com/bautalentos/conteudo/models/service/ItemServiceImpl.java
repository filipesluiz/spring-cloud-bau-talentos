package com.bautalentos.conteudo.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bautalentos.conteudo.models.Item;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private RestTemplate cliente;
	
	@Override
	public List<Item> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
