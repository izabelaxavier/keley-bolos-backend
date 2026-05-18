package com.izabelaxavier.keleybolosapi.dto;

import lombok.Data;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class PedidoResponseDTO {
    private Long id;
    private Integer quantidade;
    private String formaPagamento;
    private String observacoes;
    private LocalDate dataRetirada;
    private LocalTime horarioRetirada;
    private String produtoNome;
    private java.math.BigDecimal produtoPreco;

}