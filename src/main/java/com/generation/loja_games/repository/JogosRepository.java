package com.generation.loja_games.repository;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.generation.loja_games.model.Jogos;

public interface JogosRepository {
	
	public List <Jogos> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);

}
