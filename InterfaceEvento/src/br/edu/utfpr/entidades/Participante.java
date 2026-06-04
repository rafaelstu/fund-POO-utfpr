/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.entidades;

/**
 *
 * @author tomate
 */
public class Participante {

    private String nome;
    private int idade;

    public Participante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Participante() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("nome= ").append(nome);
        sb.append(" | idade= ").append(idade);

        return sb.toString();
    }

}
