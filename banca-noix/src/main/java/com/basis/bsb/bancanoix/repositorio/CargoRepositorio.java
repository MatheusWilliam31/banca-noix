package com.basis.bsb.bancanoix.repositorio;

import com.basis.bsb.bancanoix.dominio.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargoRepositorio extends JpaRepository<Cargo, Long> {
}
