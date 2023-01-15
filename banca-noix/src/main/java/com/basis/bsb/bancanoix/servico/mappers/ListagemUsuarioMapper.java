package com.basis.bsb.bancanoix.servico.mappers;

import com.basis.bsb.bancanoix.dominio.Usuario;
import com.basis.bsb.bancanoix.servico.dto.UsuarioListagemDTO;
import org.mapstruct.Mapper;

public interface ListagemUsuarioMapper extends EntityMapper<UsuarioListagemDTO, Usuario>{
}