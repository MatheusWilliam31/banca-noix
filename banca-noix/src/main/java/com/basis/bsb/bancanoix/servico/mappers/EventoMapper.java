package com.basis.bsb.bancanoix.servico.mappers;

import com.basis.bsb.bancanoix.dominio.Evento;
import com.basis.bsb.bancanoix.servico.dto.EventoDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {SelectMotivoMapper.class, SituacaoMapper.class, PatrocinadorMapper.class})
public interface EventoMapper extends EntityMapper<EventoDTO, Evento>{
}