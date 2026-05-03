/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.banda;

import br.edu.utfpr.musico.Musico;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tomate
 */
public class Banda {

    private static int contador = 0;

    private int id;
    private String nome;
    private Musico lider;
    private List<Musico> musicos;

    public Banda() {
        this.id = ++contador;
        this.musicos = new ArrayList<>();

    }

    public Banda(String nome, Musico lider) {
        this.id = ++contador;
        this.nome = nome;
        this.lider = lider;
        this.musicos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Musico getLider() {
        return lider;
    }

    public void setLider(Musico lider) {
        this.lider = lider;
    }

    public List<Musico> getMusicos() {
        return musicos;
    }

    public void addMusico(Musico musico) {
        musicos.add(musico);
    }

    public String imprimirMusicos() {
        StringBuilder sb = new StringBuilder();
        sb.append("Lista de músicos: \n");
        for (Musico m : musicos) {
            sb.append("- ").append(m).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Banda: ").append(id).append("\n");
        sb.append(nome).append("\n");
        sb.append("Lider: ").append(lider.getNome()).append("\n");
        sb.append(imprimirMusicos());
        return sb.toString();
    }
}
