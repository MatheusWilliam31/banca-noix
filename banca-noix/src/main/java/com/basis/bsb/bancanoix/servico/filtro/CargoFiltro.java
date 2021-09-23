package com.basis.bsb.bancanoix.servico.filtro;

import com.basis.bsb.bancanoix.dominio.Cargo;
import com.basis.bsb.bancanoix.dominio.Cargo_;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;


public class CargoFiltro implements EntityFiltro {

    private Long id;
    private String titulo;

    @Override
    public Specification<Cargo> filter() {
        return ((root, cq, cb) -> cb.and(getPredicates(root, cq, cb).toArray(new Predicate[0])));
    }

    private List<Predicate> getPredicates
            (Root<Cargo> root,
             CriteriaQuery<?> cq,
             CriteriaBuilder cb) {

        List<Predicate> predicates = new ArrayList<>();
        cq.orderBy(cb.desc(root.get("id")));

        if(id != null){
            predicates.add(cb.equal(root.get(Cargo_.id), id));
        }

        if(titulo != null){
            predicates.add(cb.like(root.get(Cargo_.titulo), "%" + titulo + "%"));
        }

        return predicates;

    }
}