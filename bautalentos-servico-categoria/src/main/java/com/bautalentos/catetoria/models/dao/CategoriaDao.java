package com.bautalentos.catetoria.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.bautalentos.catetoria.models.entity.Categoria;

public interface CategoriaDao extends CrudRepository<Categoria, Long> {
	

}
