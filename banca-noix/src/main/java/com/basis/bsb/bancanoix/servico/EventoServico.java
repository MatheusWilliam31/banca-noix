package com.basis.bsb.bancanoix.servico;

import com.basis.bsb.bancanoix.dominio.Evento;
import com.basis.bsb.bancanoix.repositorio.EventoRepositorio;
import com.basis.bsb.bancanoix.servico.dto.EmailDTO;
import com.basis.bsb.bancanoix.servico.dto.EventoDTO;
import com.basis.bsb.bancanoix.servico.exceptions.ResourceNotFoundException;
import com.basis.bsb.bancanoix.servico.mappers.EventoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class EventoServico {

    private final EventoRepositorio repositorio;
    private final EventoMapper mapper;
    private final EmailServico servico;

    @Scheduled(cron = "0 0 8 * * 5")
    public void rotinaDeEmail() {
        EmailDTO emailDTO = new EmailDTO();
        emailDTO.setDestinatario("exemplo@gmail.com");
        emailDTO.setAssunto("promocao");
        emailDTO.setCorpo("promocao do fulano");
        emailDTO.getCopias().add("exemplo@gmail.com");

        servico.enviarEmail(emailDTO);
    }

    public Page<EventoDTO> findAllPaged(PageRequest pageRequest) {
        Page<Evento> page = repositorio.findAll(pageRequest);
        return page.map(mapper::toDto);
    }

    public EventoDTO findById(Long id) {
        Optional<Evento> obj = repositorio.findById(id);
        Evento entity = obj.orElseThrow(() -> new ResourceNotFoundException("Evento não encontrado!"));
        return mapper.toDto(entity);
    }

    public EventoDTO insert(EventoDTO dto) {
        Evento entity = mapper.toEntity(dto);
        entity = repositorio.save(entity);
        return mapper.toDto(entity);
    }

    public void delete(Long id) {
        try {
            repositorio.deleteById(id);
        } catch (EmptyResultDataAccessException resultadoEx) {
            throw new ResourceNotFoundException("Evento do ID: " + id + " não encontrado!");
        }
    }
}

