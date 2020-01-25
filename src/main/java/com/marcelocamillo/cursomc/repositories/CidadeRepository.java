package com.marcelocamillo.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcelocamillo.cursomc.domain.Cidade;

/* realiza operações de acesso a dados (busca, salvar, alterar, deletar)
 * referentes ao objeto Cidade  */

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}
