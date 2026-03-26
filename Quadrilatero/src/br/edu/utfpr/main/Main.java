/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.utfpr.main;

import br.edu.utfpr.quadrilatero.Quadrilatero;
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
        Scanner input = new Scanner(System.in);
        Quadrilatero q = new Quadrilatero();

        System.out.println("informar lado 1: ");
        q.setLado1(input.nextInt());

        System.out.println("informar lado 2: ");
        q.setLado2(input.nextInt());

        System.out.println(q);
        System.out.println(q.isQuadrado() ? "é qudaraod" : "é retangualo");
        System.out.println("area: " + q.getAreaPlana());
        System.out.println("perimetro " + q.getPerimetro());
    }

}
