package com.basis.bsb.bancanoix.servico;

import com.basis.bsb.bancanoix.dominio.Usuario;
import com.basis.bsb.bancanoix.repositorio.UsuarioRepositorio;
import com.basis.bsb.bancanoix.servico.dto.UsuarioDTO;
import com.basis.bsb.bancanoix.servico.dto.UsuarioListagemDTO;
import com.basis.bsb.bancanoix.servico.exceptions.ResourceNotFoundException;
import com.basis.bsb.bancanoix.servico.mappers.ListagemUsuarioMapper;
import com.basis.bsb.bancanoix.servico.mappers.UsuarioMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class UsuarioServico {

    private final UsuarioRepositorio repositorio;
    private final ListagemUsuarioMapper listagemUsuarioMapper;
    private final UsuarioMapper mapper;

    public List<UsuarioListagemDTO> findAll(){
        return listagemUsuarioMapper.toDto(repositorio.findAll());
    }

    public UsuarioDTO findById(Long id) {
        return repositorio.findById(id).map(mapper::toDto).
                orElseThrow(() -> new ResourceNotFoundException("Usuario não encontrado!"));
    }

    public UsuarioDTO save(UsuarioDTO dto) {
        Usuario entity = mapper.toEntity(dto);
        entity = repositorio.save(entity);
        return mapper.toDto(entity);
    }

    public UsuarioDTO toggleUsuarioActive(Long id) {
        UsuarioDTO dto = findById(id);
        dto.setActive(!dto.isActive());
        save(dto);
        return dto;
    }
}
