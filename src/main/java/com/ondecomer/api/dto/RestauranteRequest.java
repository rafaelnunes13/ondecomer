package com.ondecomer.api.dto;

import java.util.List;

import com.ondecomer.model.CardapioModel;
import com.ondecomer.model.LocalizacaoModel;

public class RestauranteRequest {

	public String nome;

	public LocalizacaoModel localizacao;

	public List<CardapioModel> cardapios;
}
