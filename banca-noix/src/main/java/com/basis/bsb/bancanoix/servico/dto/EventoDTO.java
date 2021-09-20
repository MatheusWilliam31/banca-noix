package com.basis.bsb.bancanoix.servico.dto;

import com.basis.bsb.bancanoix.dominio.Situacao;
import com.basis.bsb.bancanoix.dominio.Motivo;
import com.basis.bsb.bancanoix.dominio.Usuario;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
    private Situacao situacao;

    @NotBlank
    private Motivo motivo;

    @NotBlank
    private List<Usuario> usuarios;
}
