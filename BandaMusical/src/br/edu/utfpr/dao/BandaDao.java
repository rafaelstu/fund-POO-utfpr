/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.dao;

import br.edu.utfpr.banda.Banda;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tomate
 */
public class BandaDao {

    private List<Banda> bandas;

    public BandaDao() {
        this.bandas = new ArrayList<>();
    }

    public BandaDao(List<Banda> bandas) {
        this.bandas = bandas;
    }

    public void addBanda(Banda banda) {
        bandas.add(banda);
    }

    public void removerBanda(int id) {
        boolean removeu = bandas.removeIf(b -> b.getId() == id);
        if (removeu) {
            System.out.println("Banda com id " + id + " removida.");
        } else {
            System.out.println("Nenhuma banda encontrada com id " + id + ".");
        }
    }

    public Banda pesquisarBanda(String nome) {
        for (Banda b : bandas) {
            if (b.getNome().equalsIgnoreCase(nome)) {
                return b;
            }
        }
        return null;
    }

    public void ordenarPorNome() {
        bandas.sort((b1, b2) -> b1.getNome().compareTo(b2.getNome()));
    }

    public void imprimirBanda() {
        System.out.println("Lista de bandas: ");
        for (Banda b : bandas) {
            System.out.println("ID: " + b.getId());
            System.out.println("Nome: " + b.getNome());
            System.out.println("Líder: " + b.getLider().getNome());
            System.out.println("Músicos:");
            for (var m : b.getMusicos()) {
                System.out.println("  - " + m.getNome() + " tocando " + m.getInstrumento().getNome());
            }
            System.out.println();
        }
    }

    public List<Banda> getBandas() {
        return bandas;
    }
}
