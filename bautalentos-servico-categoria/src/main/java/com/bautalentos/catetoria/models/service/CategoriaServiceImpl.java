package com.bautalentos.catetoria.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bautalentos.catetoria.models.dao.CategoriaDao;
import com.bautalentos.catetoria.models.entity.Categoria;

@Service
public class CategoriaServiceImpl implements CategoriaService {

	@Autowired
	private CategoriaDao categoriaDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Categoria> findAll() {
		return (List<Categoria>) categoriaDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Categoria findById(Long id) {
		return categoriaDao.findById(id).orElse(null);
	}

}
