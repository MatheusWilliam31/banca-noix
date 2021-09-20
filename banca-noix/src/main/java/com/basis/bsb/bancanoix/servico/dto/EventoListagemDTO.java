package com.basis.bsb.bancanoix.servico.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
public class EventoListagemDTO implements Serializable {

    private Long id;
    private String nome;
    private LocalDate data;
    private String motivo;
    private SelectDTO situacao;

}
