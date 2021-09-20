package com.basis.bsb.bancanoix.servico.mappers;

import com.basis.bsb.bancanoix.servico.dto.SelectDTO;
import com.basis.bsb.bancanoix.servico.dto.UsuarioDTO;

import java.util.List;

public interface EntityMapper <D, E>{

        E toEntity(D dto);
        UsuarioDTO toDto(E entity);

        List<E> toEntity(List<D> dtoList);
        List<SelectDTO> toDto(List<E> entityList);
}
