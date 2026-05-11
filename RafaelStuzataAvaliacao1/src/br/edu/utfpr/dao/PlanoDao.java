/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.dao;

import br.edu.utfpr.entidades.Plano;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class PlanoDao {

    private List<Plano> planos;

    public PlanoDao(List<Plano> planos) {
        this.planos = planos;
    }

    public PlanoDao() {
        this.planos = new ArrayList<>();
    }

    public void inserirPlano(Plano plano) {
        if (planos != null) {
            planos.add(plano);
        }
    }

    public boolean excluirPlanos(int id) {
        return planos.removeIf(p -> p.getId() == id);
    }

    public String imprimirPlanos() {
        StringBuilder sb = new StringBuilder();

        planos.forEach(p -> sb.append(p).append(", valor final: ")
                .append(p.calcularValorFinal()).append("\n"));

        return sb.toString();
    }

    public List<Plano> listarPlanosComPoucasAulas(int limite) {
        List<Plano> planosPoucasAulas = new ArrayList<>();

        for (Plano p : planos) {
            if (p.getQuantidadeAulas() <= limite) {
                planosPoucasAulas
                        .add(p);
            }
        }
        return planosPoucasAulas;
    }

}
