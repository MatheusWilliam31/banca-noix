package com.basis.bsb.bancanoix.builder;

import com.basis.bsb.bancanoix.dominio.Evento;
import com.basis.bsb.bancanoix.dominio.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.Collections;

@Component
public class eventoBuilder extends ConstrutorDeEntidade<Evento> {

    @Autowired
    Evento evento = new Evento();
    Usuario usuario = new Usuario();


    @Override
    public Evento construir() throws ParseException {
        return super.construir();

        evento.setNome("EventoTeste");
        evento.setData(LocalDate.now(20/8/2022));
        evento.setValor(50.00);
        evento.setPatrocinador(Collections.singletonList(usuario));






    }
}
