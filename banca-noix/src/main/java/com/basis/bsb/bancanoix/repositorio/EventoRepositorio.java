package com.basis.bsb.bancanoix.repositorio;

import com.basis.bsb.bancanoix.dominio.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepositorio extends JpaRepository<Evento, Long> {
}