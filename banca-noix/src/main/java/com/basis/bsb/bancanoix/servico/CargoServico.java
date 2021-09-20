package com.basis.bsb.bancanoix.servico;

import com.basis.bsb.bancanoix.dominio.Cargo;
import com.basis.bsb.bancanoix.repositorio.CargoRepositorio;
import com.basis.bsb.bancanoix.servico.exceptions.ResourceNotFoundException;
import com.basis.bsb.bancanoix.servico.mappers.CargoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class CargoServico {

    private final CargoRepositorio repositorio;
    private final CargoMapper mapper;

    public Cargo get(Long id){
        return repositorio.getById(id);
    }

    public List<Cargo> buscarTodos(){
        return repositorio.findAll();
    }

    public Cargo salvar(Cargo cargo){
        return repositorio.save(cargo);
    }

    public Cargo editar(Cargo cargo){
        return repositorio.save(cargo);
    }

    public void delete (Long id){
        try {
            repositorio.deleteById(id);
        }catch(EmptyResultDataAccessException resultadoEx){
            throw new ResourceNotFoundException("Cargo do ID: " + id + "não encontrado!");
        }
    }
}
