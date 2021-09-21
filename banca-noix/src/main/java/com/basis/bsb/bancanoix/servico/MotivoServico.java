package com.basis.bsb.bancanoix.servico;

import com.basis.bsb.bancanoix.dominio.Motivo;
import com.basis.bsb.bancanoix.repositorio.MotivoRepositorio;
import com.basis.bsb.bancanoix.servico.dto.MotivoDTO;
import com.basis.bsb.bancanoix.servico.exceptions.MotivoNotFoundException;
import com.basis.bsb.bancanoix.servico.exceptions.ResourceNotFoundException;
import com.basis.bsb.bancanoix.servico.mappers.MotivoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class MotivoServico {

    public final MotivoRepositorio motivoRepositorio;
    public final MotivoMapper motivoMapper;


    public Page<MotivoDTO> findAllPaged(PageRequest pageRequest) {
        Page<Motivo> page = motivoRepositorio.findAll(pageRequest);
        return page.map(motivoMapper::toDto);

    }

    public MotivoDTO findById(Long id) {
        Optional<Motivo> obj = motivoRepositorio.findById(id);
        Motivo entity = obj.orElseThrow(() -> new MotivoNotFoundException("Motivo não encontrado!!!"));
        return motivoMapper.toDto(entity);
    }


    public MotivoDTO Insert(MotivoDTO motivoDTO) {
        Motivo entity = motivoMapper.toEntity(motivoDTO);
        entity = motivoRepositorio.save(entity);
        return motivoMapper.toDto(entity);
    }


    public void delete(Long id) {
        try {
            motivoRepositorio.deleteById(id);
        } catch (EmptyResultDataAccessException resultadoEx) {
            throw new MotivoNotFoundException("Motivo não encontrado");
        }

        }
    }
