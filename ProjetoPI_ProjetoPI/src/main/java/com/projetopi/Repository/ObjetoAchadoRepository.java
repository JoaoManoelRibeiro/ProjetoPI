package com.projetopi.Repository;

import org.springframework.data.repository.CrudRepository;

import com.projetopi.models.ObjetoAchado;

public interface ObjetoAchadoRepository extends CrudRepository<ObjetoAchado, String>{
	ObjetoAchado findByCodigo(long codigo);

}
