package com.basis.bsb.bancanoix.servico;

import com.basis.bsb.bancanoix.dominio.Evento;
import com.basis.bsb.bancanoix.repositorio.EventoRepositorio;
import com.basis.bsb.bancanoix.servico.dto.EmailDTO;
import com.basis.bsb.bancanoix.servico.dto.EventoDTO;
import com.basis.bsb.bancanoix.servico.exceptions.ResourceNotFoundException;
import com.basis.bsb.bancanoix.servico.filtro.EventoFiltro;
import com.basis.bsb.bancanoix.servico.mappers.EventoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class EventoServico {

    private final EventoMapper mapper;
    private final EventoRepositorio repositorio;

    public List<EventoDTO> filtrarData(EventoFiltro filtro) {
        return mapper.toDto(repositorio.findAll(filtro.filter()));
    private final EmailServico servico;

    @Scheduled(cron = "0 0 0 * * 5")
    public void rotinaEmail() {
        EmailDTO emailDTO = new EmailDTO();
        emailDTO.setDestinatario("mwsl.loose@gmail.com");
        emailDTO.setAssunto("promocao");
        emailDTO.setCorpo("promocao de fulano");
        emailDTO.getCopias().add("mwsl.loose@gmail.com");

        servico.enviarEmail(emailDTO);
    }

    public List<EventoDTO> findAll() {
        return mapper.toDto(repositorio.findAll());
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

}