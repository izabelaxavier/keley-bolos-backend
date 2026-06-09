package com.izabelaxavier.keleybolosapi.dto;

import com.izabelaxavier.keleybolosapi.enums.StatusPedido;
import lombok.Data;
import java.time.LocalDate;
import java.time.LocalTime;
import java.math.BigDecimal;

@Data
public class PedidoResponseDTO {

    private Long id;

    private String nomeCliente;

    private Integer quantidade;

    private String formaPagamento;

    private String observacoes;

    private LocalDate dataRetirada;

    private LocalTime horarioRetirada;

    private String produtoNome;

    private BigDecimal produtoPreco;

    private StatusPedido status;

}
