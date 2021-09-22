package com.basis.bsb.bancanoix.servico.mappers;

import com.basis.bsb.bancanoix.dominio.Usuario;
import com.basis.bsb.bancanoix.servico.dto.UsuarioListagemDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = CargoMapper.class)
public interface ListagemUsuarioMapper extends EntityMapper<UsuarioListagemDTO, Usuario>{
}