package com.basis.bsb.bancanoix.dominio;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotBlank
    @Size(min = 3, max = 50)
    @Column(name = "nome")
    private String nome;

    @NotBlank
    @Column(name = "dt_nascimento")
    private LocalDate dtNascimento;

    @CPF
    @Column(name = "cpf")
    private String cpf;

    @Email
    @Column(name = "email")
    private String email;

    @NotBlank
    @Column(name = "telefone")
    private String telefone;

    @NotBlank
    @Column(name = "foto")
    private byte[] foto;

    @NotBlank
    @Column(name = "st_atividade")
    private boolean status;

    @NotBlank
    @Column(name = "cargo_id")
    private Cargo cargo;

    @ManyToMany
    @JoinTable(name = "rel_usuario_evento",
            joinColumns = @JoinColumn(name = "usuario_id"),
            inverseJoinColumns = @JoinColumn(name = "evento_id"))
    private List<Evento> eventos = new ArrayList<>();
}
