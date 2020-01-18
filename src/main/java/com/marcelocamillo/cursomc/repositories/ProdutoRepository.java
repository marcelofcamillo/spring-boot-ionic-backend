package com.marcelocamillo.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcelocamillo.cursomc.domain.Produto;

/* realiza operações de acesso a dados (busca, salvar, alterar, deletar)
 * referentes ao objeto Produto  */

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{
	
	
}
