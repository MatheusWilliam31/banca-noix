package com.basis.bsb.bancanoix.servico.filtro;

import com.basis.bsb.bancanoix.dominio.Motivo;
import com.basis.bsb.bancanoix.dominio.Motivo_;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;


public class  MotivoFiltro implements EntityFIltro {

    private Long id;
    private String descricao;
    private String titulo;

    @Override
    public Specification<Motivo> filter() {
        return (root, criteriaQuery, criteriaBuilder) ->
                criteriaBuilder.and(getPredicates(root, criteriaQuery, criteriaBuilder).toArray(new Predicate[0]));
    }


    private List<Predicate> getPredicates
            (Root<Motivo> root,
             CriteriaQuery<?> criteriaQuery,
             CriteriaBuilder criteriaBuilder) {

        List<Predicate> predicates = new ArrayList();
        criteriaQuery.orderBy(criteriaBuilder.desc(root.get("id")));


        if (id != null) {
            predicates.add(criteriaBuilder.equal(root.get(Motivo_.id), id));
        }

        if (descricao != null) {
            predicates.add(criteriaBuilder.like(root.get(Motivo_.descricao), "%" + descricao + "%"));
        }

        if (titulo != null) {
            predicates.add(criteriaBuilder.like(root.get(Motivo_.descricao), "%" + titulo + "%"));
        }

        return predicates;
    }
}
