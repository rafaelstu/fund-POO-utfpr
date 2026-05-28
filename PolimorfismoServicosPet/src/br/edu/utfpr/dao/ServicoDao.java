/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.dao;

import br.edu.utfpr.entidades.Servico;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tomate
 */
public class ServicoDao {

    private List<Servico> servicos;

    public ServicoDao(ArrayList<Servico> servicos) {
        if (servicos != null) {
            this.servicos = servicos;
        }

    }

    public ServicoDao() {
        this.servicos = new ArrayList<>();
    }

    public List<Servico> listarServicos() {
        return servicos;
    }

    public void setServicos(List<Servico> servicos) {
        if (servicos != null) {
            this.servicos = servicos;
        }
    }

    public void adicionarServicos(Servico servico) {
        if (servico != null) {
            servicos.add(servico);
        }
    }

    public boolean removerServicos(int id) {
        return servicos.removeIf(s -> s.getId() == id);
    }

    public void ordenarServicos() {
        servicos.sort((s1, s2) -> Double.compare(s1.calcularPreco(), s2.calcularPreco()));
    }

    public double calcularTotalGeral() {
        double soma = 0;

        for (Servico s : servicos) {
            soma += s.calcularPreco();
        }

        return soma;
    }

    public double calcularTotalPorTipoDeServico(String tipo) {
        double soma = 0;

        for (Servico s : servicos) {
            if (s.getTipoServico().equalsIgnoreCase(tipo)) {
                soma += s.calcularPreco();
            }
        }

        return soma;
    }

    public String imprimirServicos() {
        StringBuilder sb = new StringBuilder();

        servicos.forEach(s -> {
            sb.append(s).append("\nPreço: ").append(s.calcularPreco()).append("\n\n");
        });

        return sb.toString();

    }

}
