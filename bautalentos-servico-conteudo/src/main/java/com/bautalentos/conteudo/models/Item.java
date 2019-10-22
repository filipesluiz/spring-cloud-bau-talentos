package com.bautalentos.conteudo.models;

public class Item {

	private Conteudo conteudo;
	
	private Long condidato;

	public Item(){}
	
	public Item(Conteudo conteudo, Long condidato) {
		this.conteudo = conteudo;
		this.condidato = condidato;
	}

	public Conteudo getConteudo() {
		return conteudo;
	}

	public void setConteudo(Conteudo conteudo) {
		this.conteudo = conteudo;
	}

	public Long getCondidato() {
		return condidato;
	}

	public void setCondidato(Long condidato) {
		this.condidato = condidato;
	}
	
	
}
