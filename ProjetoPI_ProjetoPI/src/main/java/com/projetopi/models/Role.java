package com.projetopi.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.springframework.security.core.GrantedAuthority;

@Entity
public class Role implements GrantedAuthority {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8375530770752808090L;
	
	@Id
	private Long id;
	private String nomeRole;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeRole() {
		return nomeRole;
	}

	public void setNomeRole(String nomeRole) {
		this.nomeRole = nomeRole;
	}

	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return this.nomeRole;
	}

}
