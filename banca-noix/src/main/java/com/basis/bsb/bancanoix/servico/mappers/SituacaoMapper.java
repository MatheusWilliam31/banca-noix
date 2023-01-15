package com.basis.bsb.bancanoix.servico.mappers;


import com.basis.bsb.bancanoix.dominio.Situacao;
import com.basis.bsb.bancanoix.servico.dto.SelectDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

public interface SituacaoMapper extends EntityMapper<SelectDTO, Situacao> {

    @Mapping(source = "nome", target = "label")
    SelectDTO toDto(Situacao situacao);

    @InheritInverseConfiguration
    Situacao toEntity(SelectDTO selectDTO);
}
