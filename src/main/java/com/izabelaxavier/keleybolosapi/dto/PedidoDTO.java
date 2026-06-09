package com.izabelaxavier.keleybolosapi.dto;

import com.izabelaxavier.keleybolosapi.enums.StatusPedido;
import lombok.Data;
import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

@Data
public class PedidoDTO {

    private String nomeCliente;


    @NotNull(message = "Quantidade é obrigatória")
    @Positive(message = "Quantidade deve ser maior que zero")
    private Integer quantidade;

    private String formaPagamento;
    private String observacoes;
    private LocalDate dataRetirada;
    private LocalTime horarioRetirada;
    private Long produtoId;
    private StatusPedido status;
}