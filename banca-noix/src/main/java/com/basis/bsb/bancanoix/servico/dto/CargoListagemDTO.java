package com.basis.bsb.bancanoix.servico.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class CargoListagemDTO implements Serializable {

    private Long id;
    private String titulo;

    public CargoListagemDTO(Long id, String tiulo){
        this.id = id;
        this.titulo = tiulo;
    }
}
