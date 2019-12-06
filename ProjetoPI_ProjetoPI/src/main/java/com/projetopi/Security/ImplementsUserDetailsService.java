package com.projetopi.Security;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.projetopi.Repository.UsuarioRepository;
import com.projetopi.models.Usuario;


@Component
@Transactional
public class ImplementsUserDetailsService implements UserDetailsService  {
	@Autowired
	private UsuarioRepository ur;
	@Override
	public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
		Usuario usuario = ur.findByLogin(login);
		if(usuario == null) {
			throw new UsernameNotFoundException("Usuario não encontado");
		}
		return new User(usuario.getUsername(), usuario.getPassword(), true, true, true, true, usuario.getAuthorities() );
	}

}
