package com.izabelaxavier.keleybolosapi.dto;

import lombok.Data;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class PedidoDTO {
    private Integer quantidade;
    private String formaPagamento;
    private String observacoes;
    private LocalDate dataRetirada;
    private LocalTime horarioRetirada;
    private Long produtoId;
}
