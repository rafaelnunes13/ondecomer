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
	
	public RestauranteModel(String id, String nome, LocalizacaoModel localizacao, List<CardapioModel> cardapios) {
		super();
		this.id = id;
		this.nome = nome;
		this.localizacao = localizacao;
		this.cardapios = cardapios;
	}
	
	public RestauranteModel(String nome, LocalizacaoModel localizacao, List<CardapioModel> cardapios) {
		super();
		this.id = UUID.randomUUID().toString();
		this.nome = nome;
		this.localizacao = localizacao;
		this.cardapios = cardapios;
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
}
