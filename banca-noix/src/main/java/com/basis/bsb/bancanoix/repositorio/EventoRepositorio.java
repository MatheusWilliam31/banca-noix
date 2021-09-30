package com.basis.bsb.bancanoix.repositorio;

import com.basis.bsb.bancanoix.dominio.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
=======
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
>>>>>>> 6dc05f18e8aeff36a71f5f2b7e66a276f21d34ce
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

@Repository
<<<<<<< HEAD
public interface EventoRepositorio extends JpaRepository<Evento, Long> {

    @Query( " select new basis.bsb.bancanoix.servico.dto.EventoRepositorio(" +
            " evento.motivo, evento.titulo, evento.valor, evento.data) " +
            " from Cargo cargo " )

    Optional<Evento> buscarEvento(@Param("data")LocalDate data);
}
=======
public interface EventoRepositorio extends JpaRepository<Evento, Long>,
        JpaSpecificationExecutor<Evento> {
}
>>>>>>> 6dc05f18e8aeff36a71f5f2b7e66a276f21d34ce
