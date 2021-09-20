package com.basis.bsb.bancanoix.dominio;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "evento")
public class Evento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotBlank
    @Size(min = 5, max = 20)
    @Column(name = "nome")
    private String nome;

    @NotBlank
    @Column(name = "data")
    private LocalDate data;

    @NotBlank
    @Column(name = "valor")
    private Double valor;

    @ManyToOne
    @JoinColumn(name = "motivo_id")
    private Motivo motivo;

    @ManyToOne
    @JoinColumn(name = "situacao_id")
    private Situacao situacao;

}













