package com.basis.bsb.bancanoix.servico.dto;

import com.basis.bsb.bancanoix.dominio.Cargo;
import com.basis.bsb.bancanoix.dominio.Evento;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO implements Serializable {

    private Long id;

    @NotBlank
    @Size(min = 3, max = 50)
    private String nome;

    @NotBlank
    private LocalDate dtNascimento;

    @CPF
    private String cpf;

    @Email
    private String email;

    @NotBlank
    @Min(11)
    private String telefone;

    @NotBlank
    private byte[] foto;

    @NotBlank
    private boolean status;

    @NotBlank
    private Cargo cargo;

    @NotBlank
    private List<Evento> eventos;

}
