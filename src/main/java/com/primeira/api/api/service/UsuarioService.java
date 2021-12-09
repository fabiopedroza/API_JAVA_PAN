package com.primeira.api.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.primeira.api.api.repositories.UsuarioRepository;
import com.primeira.api.model.Usuario;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;
	
	public Usuario findById(Integer id) {
		Optional<Usuario> obj = repository.findById(id);
		return obj.orElse(null);
	}
	
	public List<Usuario> findAll() {
		return repository.findAll();
	}

}
