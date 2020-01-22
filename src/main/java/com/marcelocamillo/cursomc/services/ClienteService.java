package com.marcelocamillo.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcelocamillo.cursomc.domain.Cliente;
import com.marcelocamillo.cursomc.repositories.ClienteRepository;
import com.marcelocamillo.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	@Autowired
	private ClienteRepository repo; // acessa o objeto de acesso a dados
	
	// buscar uma categoria por código
	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! ID: " + id + 
				", Tipo: " + Cliente.class.getName()));
	}
}
