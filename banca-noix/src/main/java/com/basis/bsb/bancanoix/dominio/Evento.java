package com.basis.bsb.bancanoix.dominio;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "EVENTO")
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

    @ManyToMany
    @JoinTable(name = "rel_usuario_evento",
            joinColumns = @JoinColumn(name ="evento_id"),
       inverseJoinColumns = @JoinColumn(name = "patrocinador_id"))
    private List<Usuario> patrocinador  = new ArrayList<>();

}
