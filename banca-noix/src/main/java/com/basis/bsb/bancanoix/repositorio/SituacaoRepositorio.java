package com.basis.bsb.bancanoix.repositorio;

import com.basis.bsb.bancanoix.dominio.Situacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SituacaoRepositorio extends JpaRepository<Situacao, Long> {
}
