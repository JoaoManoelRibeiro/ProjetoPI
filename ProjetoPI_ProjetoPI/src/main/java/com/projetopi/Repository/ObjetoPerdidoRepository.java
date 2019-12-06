package com.projetopi.Repository;

import org.springframework.data.repository.CrudRepository;

import com.projetopi.models.ObjetoPerdido;

public interface ObjetoPerdidoRepository extends CrudRepository<ObjetoPerdido, String>{
	ObjetoPerdido findByCodigo(long codigo);

}