package com.basis.bsb.bancanoix.servico.dto;

import com.basis.bsb.bancanoix.dominio.Situacao;
import com.basis.bsb.bancanoix.dominio.Motivo;
import com.basis.bsb.bancanoix.dominio.Usuario;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EventoDTO implements Serializable {

    private Long id;

    private String nome;

    private LocalDate dtEvento;

    private Double valor;

    private Situacao situacao;

    private Motivo motivo;

    private List<Usuario> usuarios;
}
