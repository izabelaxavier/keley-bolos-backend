package com.izabelaxavier.keleybolosapi.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import jakarta.persistence.*;
import java.time.LocalTime;

@Getter
@Setter
@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer quantidade;
    private String formaPagamento;
    private String observacoes;
    private LocalDate dataRetirada;
    private LocalTime horarioRetirada;
    @ManyToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;
}
