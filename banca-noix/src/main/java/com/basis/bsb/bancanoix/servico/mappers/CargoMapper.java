package com.basis.bsb.bancanoix.servico.mappers;

import com.basis.bsb.bancanoix.dominio.Cargo;
import com.basis.bsb.bancanoix.servico.dto.SelectDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CargoMapper extends EntityMapper<SelectDTO, Cargo>{


}