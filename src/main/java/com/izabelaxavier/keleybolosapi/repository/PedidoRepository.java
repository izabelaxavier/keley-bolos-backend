package com.izabelaxavier.keleybolosapi.repository;

import com.izabelaxavier.keleybolosapi.entity.Pedido;
import com.izabelaxavier.keleybolosapi.enums.StatusPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

    List<Pedido> findByStatus(StatusPedido status);

}