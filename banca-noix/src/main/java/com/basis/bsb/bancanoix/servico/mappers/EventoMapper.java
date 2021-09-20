package com.basis.bsb.bancanoix.servico.mappers;

import com.basis.bsb.bancanoix.dominio.Evento;
import com.basis.bsb.bancanoix.dominio.Situacao;
import com.basis.bsb.bancanoix.servico.dto.EventoDTO;
import org.mapstruct.Mapper;

import java.time.LocalDate;

@Mapper(componentModel = "spring", uses = Situacao.class)
public interface EventoMapper extends EntityMapper<EventoDTO, Evento> {
    Long getId();

    LocalDate getData();

    String getNome();

}