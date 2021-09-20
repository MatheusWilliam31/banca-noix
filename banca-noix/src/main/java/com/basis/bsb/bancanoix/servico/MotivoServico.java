package com.basis.bsb.bancanoix.servico;


import com.basis.bsb.bancanoix.dominio.Motivo;
import com.basis.bsb.bancanoix.repositorio.MotivoRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import  java.util.List;


@Service
@RequiredArgsConstructor
@Transactional

public class MotivoServico {

    public final MotivoRepositorio motivoRepositorio;

    public Motivo get(Long id) {
        return motivoRepositorio.getById(id);
    }

    public List<Motivo> buscarTodos (){
        return motivoRepositorio.findAll();
    }


    public salvar (Motivo motivo) {

    }

    public Motivo editar (Motivo motivo) {
        return motivoRepositorio.save(motivo);
    }


}
