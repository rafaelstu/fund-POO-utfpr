/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.utfpr.main;

import br.edu.utfpr.cliente.Cliente;
import br.edu.utfpr.enums.TipoComputador;
import br.edu.utfpr.equipamento.Computador;

/**
 *
 * @author tomate
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente c1 = new Cliente("rafeal", "121234567890");
        Cliente c2 = new Cliente("raaks", "111234567890");
        Cliente c3 = new Cliente("rafaeasdal", "101234567890");

        Computador desktop = new Computador("asus", c3, TipoComputador.DESKTOP, "intel i7", 4.7, 3500);
        Computador notebook = new Computador("acer", c2, TipoComputador.NOTEBOOK, "amd ryzen 9", 5.8, 6700);
        Computador servidor = new Computador("positivo", c1, TipoComputador.SERVIDOR, "intel xeon 2420v3", 3.6, 10000);

        System.out.println(desktop);
        System.out.println("manutencao: " + desktop.calcularValorManutencao());

        System.out.println("\n");
        System.out.println(notebook);
        System.out.println("manutencao: " + notebook.calcularValorManutencao());

        System.out.println("\n");
        System.out.println(servidor);
        System.out.println("manutencao: " + servidor.calcularValorManutencao());

    }

}
