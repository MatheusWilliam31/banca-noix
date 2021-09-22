package com.basis.bsb.bancanoix.repositorio;

import com.basis.bsb.bancanoix.dominio.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositorio
        extends JpaRepository<Usuario, Long>,
        JpaSpecificationExecutor<Usuario> {

    boolean existsByCpf(String cpf);

}
