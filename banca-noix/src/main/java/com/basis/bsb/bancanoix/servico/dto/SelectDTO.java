package com.basis.bsb.bancanoix.servico.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class SelectDTO implements Serializable {

    private Long value;
    private String label;
}