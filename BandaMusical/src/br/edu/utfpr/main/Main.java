/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.utfpr.main;

import br.edu.utfpr.banda.Banda;
import br.edu.utfpr.dao.BandaDao;
import br.edu.utfpr.enums.TipoInstrumento;
import br.edu.utfpr.instrumento.Instrumento;
import br.edu.utfpr.musico.Musico;
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

        Instrumento guitarra = new Instrumento("Guitarra", TipoInstrumento.CORDA);
        Instrumento bateria = new Instrumento("Bateria", TipoInstrumento.PERCUSSAO);
        Instrumento flauta = new Instrumento("Flauta", TipoInstrumento.SOPRO);

        Musico carlos = new Musico("Carlos de Souza", guitarra);
        Musico ana = new Musico("Ana dos Santos", bateria);
        Musico pedro = new Musico("Pedro Andrade", flauta);

        Musico mariana = new Musico("Mariana Soares", guitarra);
        Musico joao = new Musico("João Almeida", guitarra);
        Musico lucas = new Musico("Lucas Toledo", bateria);

        Banda rock = new Banda("Rock", carlos);
        rock.addMusico(carlos);
        rock.addMusico(ana);
        rock.addMusico(pedro);

        Banda jazz = new Banda("Jazz", mariana);
        jazz.addMusico(mariana);
        jazz.addMusico(joao);
        jazz.addMusico(lucas);

        BandaDao dao = new BandaDao();
        dao.addBanda(rock);
        dao.addBanda(jazz);

        System.out.println("--- Bandas Cadastradas ---");
        dao.imprimirBanda();

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome da banda a ser pesquisada: ");
        String nomeBusca = sc.nextLine();

        Banda encontrada = dao.pesquisarBanda(nomeBusca);
        if (encontrada != null) {
            System.out.println("Banda encontrada: " + encontrada);
        } else {
            System.out.println("Banda não encontrada.");
        }

        dao.removerBanda(1);

        System.out.println("\nBandas após remoção:");
        dao.imprimirBanda();

        sc.close();
    }

}
