package com.bautalentos.conteudo.models;

public class Item {

	private Categoria categoria;
	
	private Long condidato;

	public Item(){}
	
	public Item(Categoria categoria, Long condidato) {
		this.categoria = categoria;
		this.condidato = condidato;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Long getCondidato() {
		return condidato;
	}

	public void setCondidato(Long condidato) {
		this.condidato = condidato;
	}
	
	
}
