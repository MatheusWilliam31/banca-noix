package com.basis.bsb.bancanoix.servico.mappers;

import com.basis.bsb.bancanoix.dominio.Motivo;

import com.basis.bsb.bancanoix.servico.dto.MotivoDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MotivoMapper extends EntityMapper<MotivoDTO, Motivo> {
}
