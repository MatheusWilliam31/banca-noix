package com.basis.bsb.bancanoix.servico.filtro;

import org.springframework.data.jpa.domain.Specification;

public interface EntityFiltro<T> {
    Specification<T> filter();
}
