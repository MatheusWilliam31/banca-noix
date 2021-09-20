package com.basis.bsb.bancanoix.dominio;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "evento")
public class Evento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "data")
    private LocalDate data;

    @Column(name = "valor")
    private Double valor;

    @ManyToOne
    @JoinColumn(name = "motivo_id")
    private Motivo motivo;

    @ManyToOne
    @JoinColumn(name = "situacao_id")
    private Situacao situacao;

    @ManyToMany(mappedBy = "eventos")
    private List<Usuario> usuarios = new ArrayList<>();

}













