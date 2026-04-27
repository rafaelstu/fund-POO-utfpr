/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.dao;

import br.edu.utfpr.entidades.Pessoa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tomate
 */
public class PessoaDao {

    private List<Pessoa> listaPessoa;

    public PessoaDao() {
        listaPessoa = new ArrayList<>();
    }

    public void inserir(Pessoa p) {
        if (listaPessoa != null) {
            listaPessoa.add(p);
        }
    }

    public void ordenar() {
        listaPessoa.sort((Pessoa p1, Pessoa p2) -> p1.getNome().compareTo(p2.getNome()));
    }

    public boolean excluir(int codigo) {
        return listaPessoa.removeIf(p -> p.getCodigo() == codigo);
    }

    public Pessoa buscaPorNome(String nome) {
        for (Pessoa p : listaPessoa) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                return p;
            };
        };

        return null;
    }

    public List<Pessoa> buscaPorNomeContains(String nome) {
        List<Pessoa> resultado = new ArrayList<>();

        for (Pessoa p : listaPessoa) {
            if (p.getNome().toLowerCase().contains(nome.toLowerCase())) {
                resultado.add(p);
            };
        };

        return resultado;
    }

    public String imprimir() {
        StringBuilder sb = new StringBuilder();

        listaPessoa.forEach((p) -> {
            sb.append(p).append("\n");
        });

        return sb.toString();
    }
}
