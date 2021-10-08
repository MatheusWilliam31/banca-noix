package com.basis.bsb.bancanoix.builder;

import com.basis.bsb.bancanoix.dominio.Cargo;
import com.basis.bsb.bancanoix.dominio.Usuario;
import com.basis.bsb.bancanoix.repositorio.UsuarioRepositorio;
import com.basis.bsb.bancanoix.servico.dto.UsuarioDTO;
import com.basis.bsb.bancanoix.servico.mappers.UsuarioMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.Collection;

public class UsuarioBuilder extends ConstrutorDeEntidade<Usuario> {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @Autowired
    private UsuarioMapper usuarioMapper;

    @Override
    protected Usuario construirEntidade() throws ParseException {
        Usuario usuario = new Usuario();
        usuario.setCpf("99672324049");
        usuario.setEmail("alanT@gmail.com");
        usuario.setNome("Alan Turing");
        usuario.setActive(true);
        usuario.setTelefone("09982730294");
        usuario.setDtNascimento(LocalDate.now().minusYears(23));
        Cargo cargo = new Cargo();
        cargo.setId(1L);
        usuario.setCargo(cargo);
        return usuario;
    }

    @Override
    protected Usuario persistir(Usuario entidade) {
        return usuarioRepositorio.save(entidade);
    }

    @Override
    protected Collection<Usuario> obterTodos() {
        return usuarioRepositorio.findAll();
    }

    @Override
    protected Usuario obterPorId(Long id) {
        return usuarioRepositorio.findById(id).get();
    }

    @Override
    public Usuario construir() throws ParseException {
        return super.construir();
    }

    public UsuarioDTO construirDTO() throws ParseException {
        return usuarioMapper.toDto(construir());
    }

    public UsuarioDTO construirObjDTO() throws ParseException {
        return usuarioMapper.toDto(construirEntidade());
    }

    public void delete() {
        usuarioRepositorio.deleteAll();
    }

}
