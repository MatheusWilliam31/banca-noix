package com.basis.bsb.bancanoix.builder;

import com.basis.bsb.bancanoix.dominio.Cargo;
import com.basis.bsb.bancanoix.repositorio.CargoRepositorio;
import com.basis.bsb.bancanoix.repositorio.UsuarioRepositorio;
import com.basis.bsb.bancanoix.servico.dto.CargoDTO;

import java.text.ParseException;
import java.util.Collection;

public class CargoBuilder extends ConstrutorDeEntidade {

    private CargoRepositorio cargoRepositorio;

    @Override
    protected Object construirEntidade() throws ParseException {

        Cargo cargo = new Cargo();

        cargo.setId(5L);
        cargo.setTitulo("Junior");

        return cargo;
    }

    @Override
    protected Object persistir(Object entidade) {
        return null;
    }

    @Override
    protected Collection obterTodos() {
        return null;
    }

    @Override
    protected Cargo obterPorId(Long id) {
        return cargoRepositorio.getById(id);
    }


}
