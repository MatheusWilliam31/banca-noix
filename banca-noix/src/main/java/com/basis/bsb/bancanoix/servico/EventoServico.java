package com.basis.bsb.bancanoix.servico;

import com.basis.bsb.bancanoix.dominio.Evento;
import com.basis.bsb.bancanoix.repositorio.EventoRepositorio;
import com.basis.bsb.bancanoix.servico.dto.EmailDTO;
import com.basis.bsb.bancanoix.servico.dto.EventoDTO;
import com.basis.bsb.bancanoix.servico.exceptions.ResourceNotFoundException;
import com.basis.bsb.bancanoix.servico.mappers.EventoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class EventoServico {

    private final EventoRepositorio repositorio;
    private final EventoMapper mapper;
    private final EmailServico servico;

    @Scheduled(cron = "0 0 0 * * 5")
    public void rotinaEmail() {
        EmailDTO emailDTO = new EmailDTO();
        emailDTO.setDestinatario("exempl@gmail.com");
        emailDTO.setAssunto("promocao");
        emailDTO.setCorpo("promocao de fulano");
        emailDTO.getCopias().add("exempl@gmail.com");

        servico.enviarEmail(emailDTO);
    }

    public List<EventoDTO> findAll() {
        return mapper.toDto(repositorio.findAll());
    }

    public EventoDTO findById(Long id) {
        return repositorio.findById(id).map(mapper::toDto).orElseThrow(() -> new ResourceNotFoundException("Evento não encontrado!"));
    }

    public EventoDTO save(EventoDTO dto) {
        Evento entity = mapper.toEntity(dto);
        entity = repositorio.save(entity);
        return mapper.toDto(entity);
    }

    public void delete(Long id) {
        try {
            repositorio.deleteById(id);
        } catch (EmptyResultDataAccessException resultadoEx) {
            throw new ResourceNotFoundException("Evento não encontrado!");
        }
    }
}

