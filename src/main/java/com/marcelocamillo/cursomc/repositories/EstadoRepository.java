package com.marcelocamillo.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcelocamillo.cursomc.domain.Estado;

/* realiza operações de acesso a dados (busca, salvar, alterar, deletar)
 * referentes ao objeto Estado  */

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}
