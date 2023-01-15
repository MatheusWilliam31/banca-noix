package com.basis.bsb.bancanoix.servico.filtro;

import com.basis.bsb.bancanoix.dominio.Evento;
import com.basis.bsb.bancanoix.dominio.Usuario;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.Specification;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Getter
@Setter
public class EventoFiltro implements EntityFiltro<Evento> {

    private Long id;
    private String nome;
    private String data;
    private Double valor;
    private String patrocinador;

    @Override
    public Specification<Evento> filter() {
        return ((root, cq, cb) -> cb.and(getPredicates(root, (CriteriaBuilder) cq, (CriteriaQuery<?>) cb).toArray(new Predicate[0])));
    }

    private List<Predicate> getPredicates(Root<Evento> root, CriteriaBuilder cb, CriteriaQuery<?> cq) {

        List<Predicate> predicates = new ArrayList<>();
        cq.orderBy(cb.desc(root.get(data)));

        if (Objects.nonNull(data)) {
            ParameterExpression<LocalDate> param = cb.parameter(LocalDate.class, "data");
            predicates.add(cb.equal(root.get(data), param));

        }
        if (Objects.nonNull(nome)) {
            predicates.add(cb.like(root.get(nome), "%" + nome + "%"));
        }
        if (Objects.nonNull(patrocinador)) {
            predicates.add(cb.like(root.get(patrocinador), "%" + patrocinador + "%")
            );
        }

        if (Objects.nonNull(id)) {
            Expression<?> param = cb.parameter(Long.class, "id");
            predicates.add(cb.equal(root.get(String.valueOf(id)), param));
        }
        return predicates;

    }


}

