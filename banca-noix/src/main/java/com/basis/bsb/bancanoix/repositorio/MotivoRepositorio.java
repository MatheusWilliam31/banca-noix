package com.basis.bsb.bancanoix.repositorio;

import com.basis.bsb.bancanoix.dominio.Motivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotivoRepositorio extends JpaRepository <Motivo, Long> {

}
