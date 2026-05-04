/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.dao;

import br.edu.utfpr.receita.Receita;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tomate
 */
public class ReceitaDao {

    private List<Receita> receitas;

    public ReceitaDao() {
        this.receitas = new ArrayList<>();
    }

    public void inserirReceita(Receita receita) {
        receitas.add(receita);
    }

    public void excluirReceita(int id) {
        Receita encontrada = null;
        for (Receita r : receitas) {
            if (r.getId() == id) {
                encontrada = r;
                break;
            }
        }
        if (encontrada != null) {
            receitas.remove(encontrada);
            System.out.println("Receita com id " + id + " '" + encontrada.getNome() + "' excluída com sucesso!");
        } else {
            System.out.println("Nenhuma receita encontrada com id " + id + ".");
        }
    }

    public Receita pesquisarReceita(String nome) {
        for (Receita r : receitas) {
            if (r.getNome().equalsIgnoreCase(nome)) {
                return r;
            }
        }
        return null;
    }

    public void imprimirReceitas() {
        for (Receita r : receitas) {
            System.out.println(r);
        }
    }

    public void ordenarPorTempoPreparo() {
        receitas.sort((r1, r2) -> Integer.compare(r1.getTempoPreparo(), r2.getTempoPreparo()));
    }

    public List<Receita> getReceitas() {
        return receitas;
    }
}
