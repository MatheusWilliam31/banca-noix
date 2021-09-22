package com.basis.bsb.bancanoix.servico.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EventoDTO implements Serializable {

    private Long id;

    @NotBlank
    @Size(min = 5, max = 20)
    private String nome;

    @NotBlank
    private LocalDate data;

    @NotBlank
    private Double valor;

    @NotBlank
    private SelectDTO situacao;

    @NotBlank
    @Max(30)
    private SelectDTO motivo;

    @NotBlank
    private List<SelectDTO> patrocinador;
}
