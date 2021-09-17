package com.basis.bsb.bancanoix.servico.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class UsuarioListagemDTO implements Serializable {

    private Long id;
    private String nome;
    private String email;
    private SelectDTO cargo;
    private boolean status;


}
