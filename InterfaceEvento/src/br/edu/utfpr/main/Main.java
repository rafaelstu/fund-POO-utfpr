/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.utfpr.main;

import br.edu.utfpr.entidades.EventoCultural;
import br.edu.utfpr.entidades.Participante;

/**
 *
 * @author tomate
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Participante p1 = new Participante("joao", 20);
        Participante p2 = new Participante("maria", 30);
        Participante p3 = new Participante("pedro", 40);

        EventoCultural e = new EventoCultural("show de rock", 2);

        System.out.println("o participante " + p1 + (e.adicionarParticipante(p1) ? "" : " nao") + " foi adicionado ao evento " + e.getNome());
        System.out.println("o participante " + p2 + (e.adicionarParticipante(p2) ? "" : " nao") + " foi adicionado ao evento " + e.getNome());
        System.out.println("o participante " + p3 + (e.adicionarParticipante(p3) ? "" : " nao") + " foi adicionado ao evento " + e.getNome());

        System.out.println("---");

        System.out.println(p1.getNome() + (e.verificarParticipante(p1) ? "" : " nao") + " esta registrado no evento");

        System.out.println((e.verificarLotacao() ? "ainda" : "nao") + " ha vagas disponíveis no evento");

        System.out.println("---");
        System.out.println(e);
    }

}
