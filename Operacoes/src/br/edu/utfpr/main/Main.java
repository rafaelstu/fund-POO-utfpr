package br.edu.utfpr.main;

import br.edu.utpfr.operacoes.Operacoes;

/**
 *
 * @author tomate
 */
public class Main {

    public static void main(String[] args) {
        Operacoes op = new Operacoes();

        op.setNum1(9);

        System.out.println(op.getNum1());

        op.setNum2(9);

        System.out.println(op.getNum2());

    }

}
