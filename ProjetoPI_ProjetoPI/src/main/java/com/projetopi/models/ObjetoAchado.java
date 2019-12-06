package com.projetopi.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ObjetoAchado implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	private String nome;
	
	private String descricaoAchado;

	private String dataEntrega;

	private String alunoDevolveu;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "nome [codigo=" + codigo + ", objetoAchado=" + nome + "]";
	}
	public String getDescricaoAchado() {
		return descricaoAchado;
	}

	public void setDescricaoAchado(String descricaoAchado) {
		this.descricaoAchado = descricaoAchado;
	}

	public String getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(String dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public String getAlunoDevolveu() {
		return alunoDevolveu;
	}

	public void setAlunoDevolveu(String alunoDevolveu) {
		this.alunoDevolveu = alunoDevolveu;
	}
}

