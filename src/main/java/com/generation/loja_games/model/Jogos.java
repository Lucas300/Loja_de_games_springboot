package com.generation.loja_games.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_jogos")
public class Jogos {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Esse campo é obrigatório")   //Not Null
	@Size(min = 10, max = 1000, message = "Digite no min 5 e no maximo 10 caracteres")
	private String nome;
	
	@NotBlank(message = "Esse campo é obrigatório")   //Not Null
	@Size(min = 10, max = 1000, message = "Digite no min 5 e no maximo 10 caracteres")
	private String Descricao;
	
	@DecimalMin(value = "0.0", inclusive = false, message = "O salário deve ser maior que zero.")
	@Column(nullable = false, precision = 10, scale = 2)
	private BigDecimal Preco; 
	
	@NotBlank(message = "Esse campo é obrigatório")   //Not Null
	@Size(min = 2, max = 1000, message = "Digite no min 5 e no maximo 10 caracteres")
	private String plataforma; //pc, xbox, playstation, nitendo

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome_jogo() {
		return nome;
	}

	public void setNome_jogo(String nome_jogo) {
		this.nome = nome_jogo;
	}

	public String getDescricao_jogo() {
		return Descricao;
	}

	public void setDescricao_jogo(String descricao_jogo) {
		Descricao = descricao_jogo;
	}

	public BigDecimal getPreco() {
		return Preco;
	}

	public void setPreco(BigDecimal preco) {
		Preco = preco;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	
	
}
