package com.basis.bsb.bancanoix.servico.dto;

import com.basis.bsb.bancanoix.dominio.Cargo;
import com.basis.bsb.bancanoix.dominio.Evento;
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
public class UsuarioDTO implements Serializable {

    private Long id;

    private String nome;

    private LocalDate dtNascimento;

    private String cpf;

    private String email;

    private String telefone;

    private byte[] foto;

    private boolean status;

    private Cargo cargo;

    private List<Evento> eventos;

}
