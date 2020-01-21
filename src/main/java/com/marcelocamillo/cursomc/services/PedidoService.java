package com.marcelocamillo.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcelocamillo.cursomc.domain.Pedido;
import com.marcelocamillo.cursomc.repositories.PedidoRepository;
import com.marcelocamillo.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo; // acessa o objeto de acesso a dados
	
	// buscar uma categoria por código
	public Pedido buscar(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! ID: " + id + 
				", Tipo: " + Pedido.class.getName()));
	}
	
}