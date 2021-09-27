package com.basis.bsb.bancanoix.builder;

import com.basis.bsb.bancanoix.dominio.Cargo;
import com.basis.bsb.bancanoix.repositorio.CargoRepositorio;

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
    protected Cargo persistir(Cargo cargo) {
        return cargoRepositorio.save(cargo);
    }

    @Override
    protected Collection<Cargo> obterTodos() {
        return cargoRepositorio.findAll();
    }

    @Override
    protected Cargo obterPorId(Long id) {
        return cargoRepositorio.getById(id);
    }
}
