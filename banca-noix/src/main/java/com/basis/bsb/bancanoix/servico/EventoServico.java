package com.basis.bsb.bancanoix.servico;

import com.basis.bsb.bancanoix.dominio.Evento;
import com.basis.bsb.bancanoix.dominio.Usuario;
import com.basis.bsb.bancanoix.repositorio.EventoRepositorio;
import com.basis.bsb.bancanoix.servico.dto.EmailDTO;
import com.basis.bsb.bancanoix.servico.dto.EventoDTO;
import com.basis.bsb.bancanoix.servico.exceptions.ResourceNotFoundException;
import com.basis.bsb.bancanoix.servico.filtro.EventoFiltro;
import com.basis.bsb.bancanoix.servico.mappers.EventoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Sort;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class EventoServico {

    private final EventoMapper mapper;
    private final EventoRepositorio repositorio;
    private final EmailServico servico;


    public List<EventoDTO> filtrarData(EventoFiltro filtro) {
        return mapper.toDto(repositorio.findAll((Sort) filtro.filter()));
    }

    @Scheduled(cron = "0 01 8 * * 5")
    public void rotinaEmail() {
        Optional<Evento> eventoOpcional = repositorio.findByData(LocalDate.now());
        if (eventoOpcional.isPresent()) {
            List<String> copias = new ArrayList<>();
            EmailDTO emailDTO = new EmailDTO();
            Evento eventoDoDia = eventoOpcional.get();
            emailDTO.setDestinatario("mwsl.loose@gmail.com");
            emailDTO.setAssunto("promocao");
            emailDTO.setCorpo("Novo evento, promocao de fulano" + eventoDoDia.getMotivo().getTitulo() + "esse evento vai ser patrocinado por " + eventoDoDia.getPatrocinador().toArray()[0] + " e por mais " + (eventoDoDia.getPatrocinador().toArray().length - 1));

            for (Usuario user : eventoDoDia.getPatrocinador()) {
                copias.add(user.getEmail());

            }

            emailDTO.setCopias(copias);
            servico.sendEmail(emailDTO);

        }
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

    public void delete(Long id) {
        try {
            repositorio.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException("Evento não encontrado!");
        }
    }
}
