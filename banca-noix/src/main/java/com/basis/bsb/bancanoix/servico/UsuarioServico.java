package com.basis.bsb.bancanoix.servico;

import com.basis.bsb.bancanoix.dominio.Usuario;
import com.basis.bsb.bancanoix.repositorio.UsuarioRepositorio;
import com.basis.bsb.bancanoix.servico.dto.UsuarioDTO;
import com.basis.bsb.bancanoix.servico.exceptions.ResourceNotFoundException;
import com.basis.bsb.bancanoix.servico.mappers.UsuarioMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class UsuarioServico {

    private final UsuarioRepositorio repositorio;
    private final UsuarioMapper mapper;

    public Page<UsuarioDTO> findAllPaged(PageRequest pageRequest) {
        Page<Usuario> page = repositorio.findAll(pageRequest);
        return page.map(mapper::toDto);
    }

    public UsuarioDTO findById(Long id) {
        Optional<Usuario> obj = repositorio.findById(id);
        Usuario entity = obj.orElseThrow(() -> new ResourceNotFoundException("Usuário não encontrado!"));
        return mapper.toDto(entity);
    }

    public UsuarioDTO insert(UsuarioDTO dto) {
        Usuario entity = mapper.toEntity(dto);
        entity = repositorio.save(entity);
        return mapper.toDto(entity);
    }

    public void delete(Long id) {
        try {
            repositorio.deleteById(id);
        }catch ( EmptyResultDataAccessException resultadoEx) {
            throw new ResourceNotFoundException("Usuario do ID: "+ id +" não encontrado!");
        }
    }
}
