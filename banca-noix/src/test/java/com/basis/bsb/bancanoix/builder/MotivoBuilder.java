package com.basis.bsb.bancanoix.builder;

import com.basis.bsb.bancanoix.dominio.Motivo;
import com.basis.bsb.bancanoix.repositorio.MotivoRepositorio;
import com.basis.bsb.bancanoix.servico.dto.MotivoDTO;
import com.basis.bsb.bancanoix.servico.mappers.MotivoMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.ParseException;
import java.util.Collection;

public class MotivoBuilder extends ConstrutorDeEntidade<Motivo> {
    @Autowired
    private MotivoRepositorio repositorio;

    @Autowired
    private MotivoMapper mapper;

    @Override
    protected Motivo construirEntidade() throws ParseException {
        Motivo motivo = new Motivo();
        motivo.setTitulo("Promoção");
        motivo.setDescricao("Promoção do funcionario para Pleno");
        return motivo;
    }

    @Override
    protected Motivo persistir(Motivo entidade) {
        return repositorio.save(entidade);
    }

    @Override
    protected Collection<Motivo> obterTodos() {
        return repositorio.findAll();
    }

    @Override
    protected Motivo obterPorId(Long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Motivo construir() throws ParseException {
        return super.construir();
    }

    public MotivoDTO construirDTO() throws ParseException {
        return mapper.toDto(construir());
    }

    public MotivoDTO construirObjDTO() throws ParseException {
        return mapper.toDto(construirEntidade());
    }

    public void delete() {
        repositorio.deleteAll();
    }
}
