/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.utfpr.main;

import br.edu.utfpr.dao.ReceitaDao;
import br.edu.utfpr.enums.Dificuldade;
import br.edu.utfpr.ingrediente.Ingrediente;
import br.edu.utfpr.receita.Doce;
import br.edu.utfpr.receita.Receita;
import br.edu.utfpr.receita.Salgado;

/**
 *
 * @author tomate
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Doce boloDeCenoura = new Doce("Bolo de Cenoura", 60, Dificuldade.FACIL, true);
        boloDeCenoura.addIngrediente(new Ingrediente("Farinha", "2 xícaras"));
        boloDeCenoura.addIngrediente(new Ingrediente("Ovos", "3 unidades"));
        boloDeCenoura.addIngrediente(new Ingrediente("Cenoura", "3 unidades"));
        boloDeCenoura.addIngrediente(new Ingrediente("Açúcar", "1 xícara"));

        Salgado lasanha = new Salgado("Lasanha", 90, Dificuldade.DIFICIL, "Carne");
        lasanha.addIngrediente(new Ingrediente("Massa", "500g"));
        lasanha.addIngrediente(new Ingrediente("Queijo", "300g"));
        lasanha.addIngrediente(new Ingrediente("Molho", "500ml"));
        lasanha.addIngrediente(new Ingrediente("Carne", "400g"));

        Salgado pizza = new Salgado("Pizza", 45, Dificuldade.MEDIA, "Vegetariano");
        pizza.addIngrediente(new Ingrediente("Farinha", "300g"));
        pizza.addIngrediente(new Ingrediente("Tomate", "2 unidades"));
        pizza.addIngrediente(new Ingrediente("Queijo", "200g"));

        ReceitaDao dao = new ReceitaDao();
        dao.inserirReceita(boloDeCenoura);
        dao.inserirReceita(lasanha);
        dao.inserirReceita(pizza);

        System.out.println("=== Receitas Cadastradas ===");
        dao.imprimirReceitas();

        System.out.println("\n=== Ingredientes por Receita ===");
        for (Receita r : dao.getReceitas()) {
            r.listarIngredientes();
            System.out.println();
        }

        System.out.println("=== Pesquisando Receita ===");
        String nomeBusca = "Bolo de Cenoura";
        System.out.println("Receita pesquisada: " + nomeBusca);
        Receita encontrada = dao.pesquisarReceita(nomeBusca);
        if (encontrada != null) {
            System.out.println("Resultado: " + encontrada);
        } else {
            System.out.println("Receita não encontrada.");
        }

        System.out.println("\n=== Excluindo Receita ===");
        dao.excluirReceita(2);

        System.out.println("\n=== Receitas Após Exclusão ===");
        dao.imprimirReceitas();

        System.out.println("\n=== Receitas ordenadas por tempo de preparo ===");
        dao.ordenarPorTempoPreparo();
        dao.imprimirReceitas();
    }

}
