/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.dao;

import br.edu.utfpr.model.Excursao;
import br.edu.utfpr.model.Passageiro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tomate
 */
public class ExcursaoDao {

    private List<Passageiro> todosPassageiros;

    public ExcursaoDao() {
        this.todosPassageiros = new ArrayList<>();
    }

    // Adiciona passageiro à excursão e à lista geral
    public void addPassageiro(Passageiro passageiro, Excursao excursao) {
        if (passageiro != null && excursao != null) {
            excursao.getPassageiros().add(passageiro);
            todosPassageiros.add(passageiro);
        }
    }

    // Imprime passageiros de uma excursão específica
    public String imprimirListaPassageiro(Excursao excursao) {
        StringBuilder sb = new StringBuilder();
        sb.append("Lista de Passageiros:\n");
        for (Passageiro p : excursao.getPassageiros()) {
            sb.append(p).append("\n");
        }
        return sb.toString();
    }

    // Imprime todos os passageiros cadastrados (lista geral)
    public String imprimirListaPassageiro() {
        StringBuilder sb = new StringBuilder();
        for (Passageiro p : todosPassageiros) {
            sb.append(p).append("\n");
        }
        return sb.toString();
    }

    // Remove passageiro de uma excursão pelo id; retorna true se removeu
    public boolean excluirPassageiroExcursao(Excursao excursao, int idItem) {
        if (excursao == null || excursao.getPassageiros() == null) {
            return false;
        }
        for (Passageiro p : excursao.getPassageiros()) {
            if (p.getId() == idItem) {
                excursao.getPassageiros().remove(p);
                return true;
            }
        }
        return false;
    }

    public List<Passageiro> getTodosPassageiros() {
        return todosPassageiros;
    }
}
