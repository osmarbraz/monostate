package com.monostate;

/**
 * Padrão Monostate.
 * 
 * Monostate ou estado único é uma alternativa para o Singleton.
 * 
 * Esta classe é instanciável várias vezes e cada instância compartilhará o
 * mesmo estado predefinido com todas as outras instâncias.
 */
public final class Monostate {

    //Estado compartilhado entre instâncias Monostate
    public static String valor;

    /**
     * Construtor público usado para obter instâncias do Monostate, todas
     * compartilhando mesmo estado
     *
     * @param valor Valor de inicialização.
     */
    public Monostate(String valor) {
        Monostate.valor = valor;
    }

    /**
     * Retorna o valor.
     * 
     * @return O valor compartilhado.
     */
    
    public String getValor() {
        return Monostate.valor;
    }

    /**
     * Este método retorna o estado compartilhado Monostate.
     * 
     * O método é sincronizado, porque o estado deve ser modificado atomicamente.
     *
     * @param valor Valor a ser alterado.
     */
    public synchronized void setValor(String valor) {
        Monostate.valor = valor;
    }

}
