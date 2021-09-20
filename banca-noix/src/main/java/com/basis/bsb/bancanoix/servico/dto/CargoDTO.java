package com.basis.bsb.bancanoix.servico.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class CargoDTO implements Serializable {

    private Long id;

    @NotBlank
    private String tutilo;
}
