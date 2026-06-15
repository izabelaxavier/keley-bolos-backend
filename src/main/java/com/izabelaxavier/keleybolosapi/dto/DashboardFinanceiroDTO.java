package com.izabelaxavier.keleybolosapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class DashboardFinanceiroDTO {

    private Long totalPedidos;

    private BigDecimal valorTotalVendido;
}