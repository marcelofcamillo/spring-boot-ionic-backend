package com.marcelocamillo.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcelocamillo.cursomc.domain.Pagamento;

/* realiza operações de acesso a dados (busca, salvar, alterar, deletar)
 * referentes ao objeto Pagamento  */

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

}
