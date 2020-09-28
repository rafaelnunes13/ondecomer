package com.ondecomer.model;

import java.util.List;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "restaurante")
public class RestauranteModel {

	@Id
	public String id;
	
	public String nome;

	public LocalizacaoModel localizacao;

	public List<CardapioModel> cardapios;

	public List<RestricoesEnum> restricoes;
	
	public RestauranteModel(String id, String nome, LocalizacaoModel localizacao, List<CardapioModel> cardapios, List<RestricoesEnum> restricoes) {
		super();
		this.id = id;
		this.nome = nome;
		this.localizacao = localizacao;
		this.cardapios = cardapios;
		this.restricoes = restricoes;
	}
	
	public RestauranteModel(String nome, LocalizacaoModel localizacao, List<CardapioModel> cardapios, List<RestricoesEnum> restricoes) {
		super();
		this.id = UUID.randomUUID().toString();
		this.nome = nome;
		this.localizacao = localizacao;
		this.cardapios = cardapios;
		this.restricoes = restricoes;
	}
	
	public RestauranteModel() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalizacaoModel getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(LocalizacaoModel localizacao) {
		this.localizacao = localizacao;
	}

	public List<CardapioModel> getCardapios() {
		return cardapios;
	}

	public void setCardapios(List<CardapioModel> cardapios) {
		this.cardapios = cardapios;
	}

	public List<RestricoesEnum> getRestricoes() {
		return restricoes;
	}

	public void setRestricoes(List<RestricoesEnum> restricoes) {
		this.restricoes = restricoes;
	}
}
