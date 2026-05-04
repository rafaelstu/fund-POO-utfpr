/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.model;

import br.edu.utfpr.enums.Dificuldade;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tomate
 */
public class Receita {

    private static int contador = 0;

    private int id;
    private String nome;
    private int tempoPreparo;
    private Dificuldade dificuldade;
    private List<Ingrediente> ingredientes;

    public Receita(String nome, int tempoPreparo, Dificuldade dificuldade) {
        this.id = ++contador;
        this.nome = nome;
        this.tempoPreparo = tempoPreparo;
        this.dificuldade = dificuldade;
        this.ingredientes = new ArrayList<>();
    }

    public void addIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

    public void listarIngredientes() {
        System.out.println(nome + ":");
        System.out.println("Ingredientes:");
        for (Ingrediente i : ingredientes) {
            System.out.println("  " + i);
        }
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

    public int getTempoPreparo() {
        return tempoPreparo;
    }

    public void setTempoPreparo(int tempoPreparo) {
        this.tempoPreparo = tempoPreparo;
    }

    public Dificuldade getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(Dificuldade dificuldade) {
        this.dificuldade = dificuldade;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    @Override
    public String toString() {
        return "Receita: " + nome
                + " | Tempo de Preparo: " + tempoPreparo + " min"
                + " | Dificuldade: " + dificuldade.getDescricao();
    }
}
