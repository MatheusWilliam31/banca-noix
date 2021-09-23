package com.basis.bsb.bancanoix.servico.mappers;

import com.basis.bsb.bancanoix.dominio.Usuario;
import com.basis.bsb.bancanoix.servico.dto.PatrocinadorDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = CargoMapper.class)
public interface PatrocinadorMapper extends EntityMapper<PatrocinadorDTO, Usuario> {
}