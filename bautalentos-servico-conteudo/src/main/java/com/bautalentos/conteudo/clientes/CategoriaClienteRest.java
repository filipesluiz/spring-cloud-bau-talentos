package com.bautalentos.conteudo.clientes;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.bautalentos.conteudo.models.Categoria;

@FeignClient(name = "servico-categoria")
public interface CategoriaClienteRest {

	@GetMapping("/listar")
	public List<Categoria> listar();
	
	@GetMapping("/listar/{id}")
	public Categoria detalhe(@PathVariable Long id);
}
