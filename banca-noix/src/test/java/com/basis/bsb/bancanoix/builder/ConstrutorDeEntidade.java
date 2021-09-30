package com.basis.bsb.bancanoix.builder;

import java.text.ParseException;
import java.util.Collection;

<<<<<<< HEAD
/**
 * Classe base para criação de construtores de entidades para testes
 * automatizados.
 *
 * @param <E> parâmetro
 */
public abstract class ConstrutorDeEntidade<E> {

    private CustomizacaoEntidade<E> customizacao;

    /**
     * Constroi a entidade, realizando as custimizações, caso necessário e
     * persistindo a mesma no banco
     *
     * @return entidade construída
     * @throws ParseException Exceção a ser lançada
     */
    public E construir() throws ParseException {
        final E entidade = construirEntidade();
        if (isCustomizado()) {
            customizacao.executar(entidade);
=======
public class ConstrutorDeEntidade<E> {

    private CustomizacaoEntidade customizacao;



    public E construir() throws ParseException {
        final E entidade = construirEntidade();
        if (isCustomizado()) {
            customizacao.executar((liquibase.pro.packaged.E) entidade);
>>>>>>> 6dc05f18e8aeff36a71f5f2b7e66a276f21d34ce
        }
        return persistir(entidade);
    }

<<<<<<< HEAD
    /**
     * Este método permite a customização dos atributos da entidade antes da
     * persistência
     *
     * @param customizacao customizacao
     * @return entidade customizada
     */
    public ConstrutorDeEntidade<E> customizar(CustomizacaoEntidade<E> customizacao) {
=======

    public ConstrutorDeEntidade<E> customizar(CustomizacaoEntidade customizacao) {
>>>>>>> 6dc05f18e8aeff36a71f5f2b7e66a276f21d34ce
        this.customizacao = customizacao;
        return this;
    }

<<<<<<< HEAD
    /**
     * Este método deve retornar uma instância da entidade inicializada com os
     * dados padrão para todos os testes.
     *
     * @return entidade construída
     * @throws ParseException Exceção a ser lançada
     */
    protected abstract E construirEntidade() throws ParseException;

    /**
     * Este método deve persistir e retornar a entidade recebida no parametro
     * <b>entidade</b>
     *
     * @param entidade entidade
     * @return entidade persistida
     */
    protected abstract E persistir(E entidade);

    /**
     * Este método deve persistir e retornar a entidade recebida no parametro
     * <b>entidade</b>
     *
     * @return entidade persistida
     */
    protected abstract Collection<E> obterTodos();

    /**
     * Este método deve persistir e retornar a entidade recebida no parametro
     * <b>entidade</b>
     *
     * @param id id
     * @return entidade persistida
     */
    protected abstract E obterPorId(Long id);

    /**
     * Is customizado boolean.
     *
     * @return boolean
     */
=======
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

>>>>>>> 6dc05f18e8aeff36a71f5f2b7e66a276f21d34ce
    public boolean isCustomizado() {
        return this.customizacao != null;
    }

<<<<<<< HEAD
    /**
     * @param customizacao Atribui o valor do parâmetro no atributo customizacao
     */
    public void setCustomizacao(CustomizacaoEntidade<E> customizacao) {
        this.customizacao = customizacao;
    }
}
=======
    public void setCustomizacao(CustomizacaoEntidade customizacao) {
        this.customizacao = customizacao;
    }
}

>>>>>>> 6dc05f18e8aeff36a71f5f2b7e66a276f21d34ce
