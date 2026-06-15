package com.izabelaxavier.keleybolosapi.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DashboardDTO {

    private long recebidos;
    private long emProducao;
    private long prontos;
    private long entregues;

}