package br.utfpr.edu.aula2;

import java.util.Scanner;

/**
 *
 * @author tomate
 */
public class Aula2 {

    public static void main(String[] args) {
        int num1, num2, res;
        //objeto que permite entrada de dados via teclado
        Scanner input = new Scanner(System.in);

        System.out.println("informe o valor do número 1: ");
        num1 = input.nextInt();
        System.out.println("informe o valor do número 2: ");
        num2 = input.nextInt();

        System.out.println("numero 1: " + num1 + "\nnumero 2: " + num2);

        res = num1 + num2;

        System.out.println("soma: " + res);

        if (num1 > 0) {
            for (int i = 0; i <= 10; i++) {
                System.out.println(num1 + " * " + i + " = " + (num1 * i));
            }
            if (num1 % 2 == 0) {
                System.out.println("o numero " + num1 + " é par");
            } else {
                System.out.println("o numero " + num1 + " é impar");
            }

        } else {
            System.out.println("O número nao pode ser menor que 1");

        }
    }

}
