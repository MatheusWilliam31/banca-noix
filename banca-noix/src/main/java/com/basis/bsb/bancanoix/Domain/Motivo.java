package com.basis.bsb.bancanoix.Domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "motivo")

public class Motivo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long Id;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "titulo")
    private String titulo;

}
