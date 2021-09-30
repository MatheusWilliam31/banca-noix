package com.basis.bsb.bancanoix.builder;

<<<<<<< HEAD
/**
 * Interface que define um contrato para permitir a custimização de uma entidade
 * no momento de sua contrução, para utilização em testes
 *
 * @param <E> Tipo da entidade a ser customizado
 */
public interface CustomizacaoEntidade <E>{

    /**
     * Executa a customização da entidade
     *
     * @param entidade a ser customizada
     */
    void executar(E entidade);

}
=======
public interface CustomizacaoEntidade<E>{

    void executar(E entidade);
    }
>>>>>>> 6dc05f18e8aeff36a71f5f2b7e66a276f21d34ce
