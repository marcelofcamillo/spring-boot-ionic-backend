package com.marcelocamillo.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcelocamillo.cursomc.domain.Pedido;

/* realiza operações de acesso a dados (busca, salvar, alterar, deletar)
 * referentes ao objeto Pedido  */

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
