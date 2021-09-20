package com.basis.bsb.bancanoix.repositorio;

import com.basis.bsb.bancanoix.dominio.Situacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SituacaoRepository extends JpaRepository<Situacao, Long> {
}