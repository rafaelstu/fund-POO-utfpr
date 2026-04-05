/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.utfpr.view;

import br.edu.utfpr.model.Aluno;
import br.edu.utfpr.model.Servidor;
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
        Scanner sc = new Scanner(System.in);
        Aluno a = new Aluno();
        Servidor s = new Servidor();

        System.out.println("informe o nome do aluno: ");
        a.setNome(sc.next());

        System.out.println("informe a idade do aluno: ");
        a.setIdade(sc.nextInt());

        System.out.println("informe a matricula do aluno: ");
        a.setMatricula(sc.nextInt());

        System.out.println(a);

        System.out.println("informe o nome do servidor: ");
        s.setNome(sc.next());

        System.out.println("informe a idade do servidor: ");
        s.setIdade(sc.nextInt());

        System.out.println("informe a matricula do servidor: ");
        s.setSiape(sc.nextInt());

        System.out.println(s);

        sc.close();
    }

}
