/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.utfpr.main;

import br.edu.utfpr.dao.ServicoDao;
import br.edu.utfpr.entidades.Banho;
import br.edu.utfpr.entidades.ConsultaVeterinaria;
import br.edu.utfpr.entidades.Tosa;
import br.edu.utfpr.enums.Porte;
import java.time.LocalDate;
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

        ServicoDao dao = new ServicoDao();

        // Serviços iniciais
        dao.adicionarServicos(new Banho("Alice", "Buddy", LocalDate.of(2024, 12, 1), 0, Porte.PEQUENO));
        dao.adicionarServicos(new Tosa(true, "Carlos", "Max", LocalDate.of(2024, 12, 2), 0));
        dao.adicionarServicos(new ConsultaVeterinaria(false, "Joana", "Luna", LocalDate.of(2024, 12, 3), 0));
        dao.adicionarServicos(new Banho("Fernanda", "Aika", LocalDate.of(2024, 12, 4), 0, Porte.GRANDE));
        dao.adicionarServicos(new Banho("Fernanda", "Tita", LocalDate.of(2024, 12, 4), 0, Porte.MEDIO));

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Sistema de Agendamentos de Serviços Pet ---");
            System.out.println("1. Listar serviços");
            System.out.println("2. Remover serviço");
            System.out.println("3. Ordenar serviços por preço");
            System.out.println("4. Calcular total dos serviços");
            System.out.println("5. Calcular Total por tipo de serviço");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 ->
                    System.out.println(dao.imprimirServicos());

                case 2 -> {
                    System.out.print("Informe o id do serviço que deseja remover: ");
                    int id = sc.nextInt();
                    boolean removido = dao.removerServicos(id);
                    System.out.println(removido
                            ? "Serviço removido com sucesso."
                            : "Serviço não encontrado.");
                }

                case 3 -> {
                    dao.ordenarServicos();
                    System.out.println("Serviços ordenados por preço:");
                    System.out.println(dao.imprimirServicos());
                }

                case 4 ->
                    System.out.printf("Total geral: R$ %.1f%n", dao.calcularTotalGeral());

                case 5 -> {
                    System.out.println("Selecione o tipo de serviço:");
                    System.out.println("1. Banho");
                    System.out.println("2. Tosa");
                    System.out.println("3. Consulta Veterinária");
                    System.out.print("Opção: ");
                    int tipo = sc.nextInt();
                    String tipoStr = switch (tipo) {
                        case 1 ->
                            "Banho";
                        case 2 ->
                            "Tosa";
                        case 3 ->
                            "Consulta veterinária";
                        default ->
                            "";
                    };
                    if (tipoStr.isEmpty()) {
                        System.out.println("Tipo inválido.");
                    } else {
                        System.out.printf("Total do tipo '%s': R$ %.1f%n",
                                tipoStr, dao.calcularTotalPorTipoDeServico(tipoStr));
                    }
                }

                case 0 ->
                    System.out.println("Encerrando o sistema.");

                default ->
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }

}
