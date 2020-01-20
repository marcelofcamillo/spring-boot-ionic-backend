package com.marcelocamillo.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcelocamillo.cursomc.domain.Endereco;

/* realiza operações de acesso a dados (busca, salvar, alterar, deletar)
 * referentes ao objeto Categoria  */

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer>{
	
	
}
