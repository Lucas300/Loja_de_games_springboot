package com.generation.loja_games.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categorias")
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Esse campo é obrigatório")   //Not Null
	@Size(min = 10, max = 1000, message = "Digite no min 2 e no maximo 10 caracteres")
	private String nome;
	
	@NotBlank(message = "Esse campo é obrigatório")   //Not Null
	@Size(min = 10, max = 1000, message = "Digite no min 5 e no maximo 10 caracteres")
	private String descricao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome_categoria() {
		return nome;
	}

	public void setNome_categoria(String nome_categoria) {
		this.nome = nome_categoria;
	}

	public String getDescricao_categoria() {
		return descricao;
	}

	public void setDescricao_categoria(String descricao_categoria) {
		this.descricao= descricao_categoria;
	}
	
	
}
