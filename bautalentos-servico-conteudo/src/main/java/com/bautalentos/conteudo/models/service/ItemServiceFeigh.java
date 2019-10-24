package com.bautalentos.conteudo.models.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.bautalentos.conteudo.clientes.CategoriaClienteRest;
import com.bautalentos.conteudo.models.Item;

@Service("serviceFeigh")
@Primary /** Esta anotação indica que essa implementação será utilizado para injeção, 
* ou pode-se utilizar o @Qualifier passando o nome do serviço.
* @see ConteudoController **/
public class ItemServiceFeigh implements ItemService{

	@Autowired
	private CategoriaClienteRest categoriaClienteRest;
	
	@Override
	public List<Item> findAll() {
		return categoriaClienteRest.listar().stream().map(c -> new Item(c)).collect(Collectors.toList());
	}

	@Override
	public Item findById(Long id) {
		return new Item(categoriaClienteRest.detalhe(id));
	}

}
