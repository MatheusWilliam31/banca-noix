package com.basis.bsb.bancanoix.servico.mappers;

import com.basis.bsb.bancanoix.dominio.Evento;
import com.basis.bsb.bancanoix.dominio.Situacao;
import com.basis.bsb.bancanoix.servico.dto.SelectDTO;
import com.basis.bsb.bancanoix.servico.dto.SituacaoDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = Evento.class)
public interface SituacaoMapper extends EntityMapper <SituacaoDTO, Situacao> {
    List<Situacao> toEntity(List<SituacaoDTO> dtoList);

    Long getId();

    String getNome();

    Situacao toEntity(SelectDTO selectDTO);
}
