package com.projetopi.Repository;

import org.springframework.data.repository.CrudRepository;

import com.projetopi.models.Usuario;



public interface UsuarioRepository extends CrudRepository<Usuario, String> {
	Usuario findByLogin(String login);
}
