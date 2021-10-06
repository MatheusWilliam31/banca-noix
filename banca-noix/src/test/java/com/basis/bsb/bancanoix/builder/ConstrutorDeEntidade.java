package com.basis.bsb.bancanoix.builder;

import java.text.ParseException;
import java.util.Collection;

public class ConstrutorDeEntidade<E> {

    private CustomizacaoEntidade<E> customizacao;

    public E construir() throws ParseException {
        final E entidade = construirEntidade();
        if (isCustomizado()) {
            customizacao.executar(entidade);
        }
        return persistir(entidade);
    }


    public ConstrutorDeEntidade<E> customizar(CustomizacaoEntidade<E> customizacao) {
        this.customizacao = customizacao;
        return this;
    }

    protected E construirEntidade() throws ParseException {
        return null;
    }

    protected E persistir(E entidade) {
        return null;
    }

    protected Collection<E> obterTodos() {
        return null;
    }

    protected E obterPorId(Long id) {
        return null;
    }

    public boolean isCustomizado() {
        return this.customizacao != null;
    }

    public void setCustomizacao(CustomizacaoEntidade<E> customizacao) {
        this.customizacao = customizacao;
    }
}

