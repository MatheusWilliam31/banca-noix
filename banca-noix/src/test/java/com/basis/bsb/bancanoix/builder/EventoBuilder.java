package com.basis.bsb.bancanoix.builder;

import com.basis.bsb.bancanoix.dominio.Evento;
import com.basis.bsb.bancanoix.repositorio.EventoRepositorio;
import com.basis.bsb.bancanoix.servico.dto.EventoDTO;
import com.basis.bsb.bancanoix.servico.mappers.EventoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.Collection;

@Component
public class EventoBuilder extends ConstrutorDeEntidade<Evento>{

    @Autowired
    private EventoRepositorio eventoRepositorio;

    @Autowired
    private EventoMapper eventoMapper;

    @Override
    protected Evento construirEntidade() throws ParseException {
        Evento evento = new Evento();
        evento.setNome("Francisco Doglas");
        evento.setData(LocalDate.now().minusDays(6));
        evento.setValor(100.00);

        return evento;
    }

    @Override
    protected Evento persistir(Evento entidade) {
        return eventoRepositorio.save(entidade);
    }

    @Override
    protected Collection<Evento> obterTodos() {
        return eventoRepositorio.findAll();
    }

    @Override
    protected Evento obterPorId(Long id) {
        return eventoRepositorio.findById(id).get();
    }

    @Override
    public Evento construir() throws ParseException {
        return super.construir();
    }


    public EventoDTO construirDTO() throws ParseException {
        return eventoMapper.toDto(construir());
    }


    public EventoDTO construirObjDTO() throws ParseException {
        return eventoMapper.toDto(construirEntidade());
    }


    public void delete() {
        eventoRepositorio.deleteAll();
    }

}

