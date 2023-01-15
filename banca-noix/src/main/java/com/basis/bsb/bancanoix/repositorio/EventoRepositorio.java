package com.basis.bsb.bancanoix.repositorio;


import com.basis.bsb.bancanoix.dominio.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface EventoRepositorio extends JpaRepository<Evento, Long> {


    Optional<Evento> findByNome(String nome);
    Optional<Evento> findByData(LocalDate data);
}
