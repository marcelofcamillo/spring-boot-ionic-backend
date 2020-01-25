package com.marcelocamillo.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.marcelocamillo.cursomc.domain.Cliente;

/* realiza operações de acesso a dados (busca, salvar, alterar, deletar)
 * referentes ao objeto Cliente */

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

	@Transactional(readOnly=true)
	Cliente findByEmail(String email);
}
