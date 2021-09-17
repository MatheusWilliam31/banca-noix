package com.basis.bsb.bancanoix.servico.mappers;

import com.basis.bsb.bancanoix.dominio.Cargo;
import com.basis.bsb.bancanoix.dominio.Usuario;
import com.basis.bsb.bancanoix.servico.dto.UsuarioDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = Cargo.class)
public interface UsuarioMapper extends EntityMapper <UsuarioDTO, Usuario>{
}
