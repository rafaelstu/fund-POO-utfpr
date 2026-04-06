/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.utfpr.main;

import br.edu.utfpr.boletim.BoletimComRecuperacao;
import br.edu.utfpr.boletim.BoletimEscolar;
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
        BoletimEscolar b = new BoletimEscolar();

        System.out.println("digite o nome do aluno: ");
        b.setNome(s.next());

        for (int i = 0; i < 4; i++) {
            System.out.println("digite a nota " + (i + 1));
            b.setNota(i, s.nextDouble());
        }

        System.out.println(b.toString());
        System.out.println(String.format("media: %.2f", b.calcularMedia()));

        if (b.calcularMedia() >= 7) {
            System.out.println("aluno aprovado sem recuperação");
        } else {

            BoletimComRecuperacao bR = new BoletimComRecuperacao();
            bR.setNome(b.getNome());
            for (int i = 0; i < 4; i++) {

                bR.setNota(i, b.getNota(i));
            }

            System.out.println("aluno em recuperação");

            System.out.println("digite a nota de recuperação: ");
            bR.setNotaRec(s.nextDouble());

            System.out.println("boletim após recuperação");
            System.out.println(bR.toString());
            System.out.println(String.format("media final %.2f", bR.calcularMediaFinal()));

            if (bR.calcularMediaFinal() >= 7) {
                System.out.println("aluno aprovado após recuperação");
            } else {
                System.out.println("aluno reprovado após recuperação");
            }

        }

        s.close();
    }
}
