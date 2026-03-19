package br.edu.utfpr.main;

import br.edu.utpfr.operacoes.Operacoes;

/**
 *
 * @author tomate
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("operacoes1");
        Operacoes op1 = new Operacoes();
        op1.setNum1(15);
        op1.setNum2(9);
        System.out.println(op1);
        System.out.println("soma: " + op1.somar());
        System.out.println("subtrai: " + op1.subtrair());
        System.out.println("multiplica: " + op1.multiplicar());
        System.out.println("divide: " + op1.dividir());

        System.out.println("\noperacoes2");
        Operacoes op2 = new Operacoes(5, 2);
        System.out.println(op2);
        System.out.println("soma: " + op2.somar());
        System.out.println("subtrai: " + op2.subtrair());
        System.out.println("multiplica: " + op2.multiplicar());
        System.out.println("divide: " + op2.dividir());
    }

}
