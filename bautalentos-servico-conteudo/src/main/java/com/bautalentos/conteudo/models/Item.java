package com.bautalentos.conteudo.models;

public class Item {

	private Categoria categoria;
	
	public Item(){}
	
	public Item(Categoria categoria) {
		this.categoria = categoria;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
}
