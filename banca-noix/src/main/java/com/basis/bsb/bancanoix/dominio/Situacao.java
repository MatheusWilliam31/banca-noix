package com.basis.bsb.bancanoix.dominio;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="situacao")
public class Situacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name ="situacao_id")
    private Situacao situacao;


}
