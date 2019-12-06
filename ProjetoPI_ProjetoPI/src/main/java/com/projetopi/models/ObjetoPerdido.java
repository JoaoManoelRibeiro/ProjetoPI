package com.projetopi.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ObjetoPerdido implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private long codigo;

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	private String nome;
	
	private String descricaoPerdido;

	private String proprietario;
	
	private String dataDesaparecimento;
	
	private String local;
	
	private String observacoes;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricaoPerdido() {
		return descricaoPerdido;
	}

	public void setDescricaoPerdido(String descricaoPerdido) {
		this.descricaoPerdido = descricaoPerdido;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public String getDataDesaparecimento() {
		return dataDesaparecimento;
	}

	public void setDataDesaparecimento(String dataDesaparecimento) {
		this.dataDesaparecimento = dataDesaparecimento;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
}