/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.utfpr.main;

import br.edu.utfpr.entidades.Pessoa;
import br.edu.utfpr.exception.TrataIdade;
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
        Scanner s = new Scanner(System.in);

        boolean valido = false;

        while (!valido) {
            try {
                System.out.println("informe o ano de nascimento");
                int a = s.nextInt();
                Pessoa p = new Pessoa("nome", a);

                System.out.println(p);
                valido = true;
            } catch (TrataIdade e) {
                System.out.println("erro: " + e.getMessage());
            }

        }

        s.close();
    }

}
