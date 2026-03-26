/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.utfpr.main;

import br.edu.utfpr.conta.Conta;
import java.util.Scanner;

/**
 *
 * @author tomate
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        Conta c = new Conta();

        System.out.println("INFORME O NUMERO DA CONTA: ");
        c.setNumero(i.nextInt());

        System.out.println("dados iniciais\n" + c);

        System.out.println("efetue seu deposito: ");
        c.depositar(i.nextDouble());
        System.out.println("saldo após deposito: " + String.format("%.2f", c.getSaldo()));

        System.out.println("realize seu saque: ");
        if (c.sacar(i.nextDouble())) {
            System.out.println("saque efetuado. saldo atual: " + String.format("%.2f", c.getSaldo()));

        } else {
            System.out.println("erro ao sacar. verifique valor e saldo disponivel");
        }

    }

}
