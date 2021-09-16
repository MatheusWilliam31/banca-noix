package com.basis.bsb.bancanoix.dominio;
    import lombok.Getter;
    import lombok.Setter;

    import javax.persistence.*;
    import java.io.Serializable;
    import java.time.LocalDate;
    import java.util.List;

@Entity
@Getter
@Setter
@Table(name="evento")
public class Evento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @ManyToOne
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "motivo_id")
    private Motivo motivo;

    @Basic
    @Temporal(TemporalType.DATE)
    @Column(name = "data")
    private LocalDate data;


    @Column(name = "valor")
    private Double valor;


    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "evento_usuario", joinColumns = {
            @JoinColumn(name = "usuario_id")
    }, inverseJoinColumns = {
            @JoinColumn(name = "evento_id")
    })
    private List<Evento> evento;


    @ManyToOne
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "situacao_id")
    private Situacao situacao;

}













