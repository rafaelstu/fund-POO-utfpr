/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.utfpr.main;

import br.edu.utfpr.dao.ExcursaoDao;
import br.edu.utfpr.model.Excursao;
import br.edu.utfpr.model.Guia;
import br.edu.utfpr.model.Passageiro;
import br.edu.utfpr.model.Veiculo;
import java.time.LocalDate;

/**
 *
 * @author tomate
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Guia guia1 = new Guia(1234, "(46) 3225-0909", "Lucia Ferreira");
        Guia guia2 = new Guia(5678, "(46) 9888-1234", "Marcos Alves");

        Veiculo van = new Veiculo("Van", "ABC-8989", 12);
        Veiculo onibus = new Veiculo("Ônibus", "XYZ-1234", 40);

        Excursao exc1 = new Excursao("Fernando de Noronha",
                LocalDate.now(), guia1, van, null);

        Excursao exc2 = new Excursao("Chapada dos Veadeiros",
                LocalDate.now(), guia2, onibus, null);

        ExcursaoDao dao = new ExcursaoDao();

        dao.addPassageiro(new Passageiro("123345", 25, "Carlos Silva"), exc1);
        dao.addPassageiro(new Passageiro("234456", 30, "Ana Souza"), exc1);
        dao.addPassageiro(new Passageiro("345567", 28, "Beatriz Oliveira"), exc1);
        dao.addPassageiro(new Passageiro("456678", 35, "Felipe Costa"), exc1);

        dao.addPassageiro(new Passageiro("567890", 22, "Juliana Almeida"), exc2);
        dao.addPassageiro(new Passageiro("678901", 31, "Roberto Silva"), exc2);
        dao.addPassageiro(new Passageiro("789012", 27, "Mariana Costa"), exc2);
        dao.addPassageiro(new Passageiro("890123", 29, "Thiago Pereira"), exc2);

        System.out.println("--------------------Excursão 1 --------------------------");
        System.out.println("Destino: " + exc1.getDestino());
        System.out.println("Data: " + exc1.getData());
        System.out.println(exc1.getGuiaResponsavel());
        System.out.println(exc1.getVeiculo());
        System.out.println();
        System.out.print(dao.imprimirListaPassageiro(exc1));

        System.out.println("\n--------------------Excursão 2 --------------------------");
        System.out.println("Destino: " + exc2.getDestino());
        System.out.println("Data: " + exc2.getData());
        System.out.println(exc2.getGuiaResponsavel());
        System.out.println(exc2.getVeiculo());
        System.out.println();
        System.out.print(dao.imprimirListaPassageiro(exc2));

        System.out.println("\n---------------Lista de todos os passageiros -------------------");
        System.out.print(dao.imprimirListaPassageiro());

        System.out.println("\nEXCLUIR PASSAGEIRO");
        boolean removeu = dao.excluirPassageiroExcursao(exc2, 6);
        if (removeu) {
            System.out.println("Passageiro excluído com sucesso.");
        } else {
            System.out.println("Passageiro não encontrado.");
        }

        System.out.println("------------Lista de passageiros atualizada--------------");
        System.out.println("Destino: " + exc2.getDestino());
        System.out.println("Data: " + exc2.getData());
        System.out.println(exc2.getGuiaResponsavel());
        System.out.println(exc2.getVeiculo());
        System.out.println();
        System.out.println("Lista de Passageiros:");
        for (Passageiro p : exc2.getPassageiros()) {
            System.out.println("ID: " + p.getId() + ", " + p);
        }
    }

}
