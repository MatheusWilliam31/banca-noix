package com.basis.bsb.bancanoix.servico.mappers;

import com.basis.bsb.bancanoix.dominio.Evento;
import com.basis.bsb.bancanoix.dominio.Motivo;
import com.basis.bsb.bancanoix.dominio.Situacao;
import com.basis.bsb.bancanoix.servico.dto.EventoDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {Motivo.class, Situacao.class})
public interface EventoMapper extends EntityMapper<EventoDTO, Evento>{
}