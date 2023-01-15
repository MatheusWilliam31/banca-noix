package com.basis.bsb.bancanoix.servico.mappers;

import com.basis.bsb.bancanoix.dominio.Motivo;
import com.basis.bsb.bancanoix.servico.dto.SelectDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

public interface SelectMotivoMapper extends EntityMapper<SelectDTO, Motivo> {

    @Mapping(source = "titulo", target = "label")
    SelectDTO toDto(Motivo motivo);

    @InheritInverseConfiguration
    Motivo toEntity(SelectDTO selectDTO);
}
