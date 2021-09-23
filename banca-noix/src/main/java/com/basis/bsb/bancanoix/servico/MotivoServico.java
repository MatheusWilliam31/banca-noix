package com.basis.bsb.bancanoix.servico;

import com.basis.bsb.bancanoix.dominio.Motivo;
import com.basis.bsb.bancanoix.repositorio.MotivoRepositorio;
import com.basis.bsb.bancanoix.servico.dto.MotivoDTO;
import com.basis.bsb.bancanoix.servico.exceptions.ResourceNotFoundException;
import com.basis.bsb.bancanoix.servico.filtro.MotivoFiltro;
import com.basis.bsb.bancanoix.servico.mappers.MotivoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class MotivoServico {

    public final MotivoRepositorio repositorio;
    public final MotivoMapper mapper;
    private final MotivoFiltro motivoFiltro;

    public List<MotivoDTO> findAll(){
        return mapper.toDto(repositorio.findAll());
    }

    public List<MotivoDTO> findAllTitle(MotivoFiltro filtro){
        return mapper.toDto(repositorio.findAll(filtro.filter()));
    }

    public MotivoDTO findById(Long id) {
        return repositorio.findById(id).map(mapper::toDto).orElseThrow(() -> new ResourceNotFoundException("Motivo inexistente"));
    }

    public MotivoDTO save(MotivoDTO dto) {
        Motivo entity = mapper.toEntity(dto);
        entity = repositorio.save(entity);
        return mapper.toDto(entity);
    }

    public void delete(Long id) {
        try {
            repositorio.deleteById(id);
        } catch (EmptyResultDataAccessException resultadoEx) {
            throw new ResourceNotFoundException("Motivo não encontrado!!!");
        }
    }
}
