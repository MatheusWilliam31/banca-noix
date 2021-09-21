package com.basis.bsb.bancanoix.servico.exceptions;

public class MotivoNotFoundException extends  RuntimeException {
    private static final long serialVersionUID = 1L;

     public MotivoNotFoundException(String msg){
         super (msg);
     }
}
