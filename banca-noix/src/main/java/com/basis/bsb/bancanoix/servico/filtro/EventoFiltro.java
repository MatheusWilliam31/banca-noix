package com.basis.bsb.bancanoix.servico.filtro;

import com.basis.bsb.bancanoix.dominio.Evento;
import com.basis.bsb.bancanoix.dominio.Evento_;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



@Getter
@Setter
public class EventoFiltro implements EntityFiltro<Evento> {

    private Long id;
    private String nome;
    private String data;
    private String usuario;
    private Double valor;

    @Override
    public Specification<Evento> filter() {
        return (root, cq, cb) ->
                cb.and(getPredicates(root, cb, cq)
                        .toArray(new Predicate[0]));
    }

    private List<Predicate> getPredicates(Root<Evento> root, CriteriaBuilder cb, CriteriaQuery<?> cq) {

        List<Predicate> predicates = new ArrayList<>();
        cq.orderBy(cb.desc(root.get(Evento_.data)));

        if (data != null) {
            ParameterExpression<LocalDate> param = cb.parameter(LocalDate.class, "data");
            predicates.add(cb.equal(root.get(Evento_.data), param));

        }
        return predicates;

    }

}
