package com.bautalentos.catetoria.models.service;

import java.util.List;

import com.bautalentos.catetoria.models.entity.Categoria;

public interface CategoriaService {

	public List<Categoria> findAll();
	
	public Categoria findById(Long id);
}
