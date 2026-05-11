/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.utfpr.main;

import br.edu.utfpr.dao.PlanoDao;
import br.edu.utfpr.entidades.Cliente;
import br.edu.utfpr.entidades.Plano;
import br.edu.utfpr.entidades.PlanoAnual;
import br.edu.utfpr.entidades.PlanoMensal;

/**
 *
 * @author Dell
 */
public class UsandoPlano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //clientes criados
        Cliente c1 = new Cliente("Ana", "9999-1111", "ana@gmail.com");
        Cliente c2 = new Cliente("Carlos", "9999-2222", "carlos@gmail.com");
        Cliente c3 = new Cliente("Marina", "9999-3333", "marina@gmail.com");

        //crie os planos b�sico(mensal), premium(anual), gold(anual), avan�ado(mensal)
        PlanoMensal basico = new PlanoMensal(120, "básico", c1);
        PlanoAnual premium = new PlanoAnual(20, 500, "premium", c2);
        PlanoAnual gold = new PlanoAnual(15, 400, "gold", c3);
        PlanoMensal avancado = new PlanoMensal(15, "avançado", c3);

//imprima os planos individualmente
        System.out.println(basico + ", valor final: " + basico.calcularValorFinal());
        System.out.println(premium + ", valor final: " + premium.calcularValorFinal());
        System.out.println(gold + ", valor final: " + gold.calcularValorFinal());
        System.out.println(avancado + ", valor final: " + avancado.calcularValorFinal());

        //insira os planos na lista
        PlanoDao p = new PlanoDao();

        p.inserirPlano(basico);
        p.inserirPlano(premium);
        p.inserirPlano(gold);
        p.inserirPlano(avancado);

        System.out.println("\nAdicionar 30 aulas ao Plano B�sico");
        //adicione aulas conforme o enunciado
        basico.adicionarAulas(30);

        System.out.println("Adicionar 50 aulas ao Plano Premium");
        //adicione aulas conforme o enunciado
        premium.adicionarAulas(50);

        System.out.println("Adicionar 40 aulas ao Plano Gold");
        //adicione aulas conforme o enunciado
        gold.adicionarAulas(40);

        System.out.println("Adicionar 30 aulas ao Plano Avan�ado");
        //adicione aulas conforme o enunciado
        avancado.adicionarAulas(30);

        System.out.println("\n=== lISTA DE PLANOS AP�S MOVIMENTA��O ===");
        //imprima a lista de planos
        System.out.println(p.imprimirPlanos());

        System.out.println("Adicionar 20 aulas ao Plano Premium");
        //adicione aulas conforme o enunciado
        premium.adicionarAulas(20);

        System.out.println("\nUsar 10 aulas do Plano B�sico");
        //use aulas conforme o enunciado
        if (basico.usarAula(10)) {
            System.out.println("aulas utilizadas");
        } else {
            System.out.println("nao foi possivel utilizar as aulas");
        }

        System.out.println("\nUsar 80 aulas do Plano Premium");
        //use aulas conforme o enunciado
        if (premium.usarAula(80)) {
            System.out.println("aulas utilizadas");
        } else {
            System.out.println("nao foi possivel utilizar as aulas");
        }

        System.out.println("\n=== lISTA DE PLANOS AP�S MOVIMENTA��O ===");
        //imprima a lista de planos
        System.out.println(p.imprimirPlanos());

        System.out.println("=== Excluindo Plano B�sico ===");
        //exclua o plano b�sico pelo id
        if (p.excluirPlanos(1)) {
            System.out.println("plano excluido");
        } else {
            System.out.println("nao foi possivel excluir o plano");
        }

        System.out.println("\n=== Lista ap�s exclus�o ===");
        //imprima a lista de planos
        System.out.println(p.imprimirPlanos());

        System.out.println("=== Planos com poucas aulas (<=60) ===");
        //imprima a lista de planos com menos ou igual a 60 aulas
        StringBuilder sb = new StringBuilder();
        p.listarPlanosComPoucasAulas(60).forEach(pl -> sb.append(pl).append("\n"));

        System.out.println(sb.toString());
    }

}
