package com.basis.bsb.bancanoix.servico.filtro;

import org.springframework.data.jpa.domain.Specification;

public interface EntityFIltro<T> {

    Specification<T> filter();
}
