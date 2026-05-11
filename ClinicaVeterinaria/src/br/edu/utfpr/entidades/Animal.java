/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.entidades;

/**
 *
 * @author tomate
 */
public class Animal {

    private String nome;
    private String especie;
    private int idade;
    private Tutor tutor;

    public Animal() {
    }

    public Animal(String nome, String especie, int idade, Tutor tutor) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.tutor = tutor;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
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
        sb.append("Animal: ").append(nome);
        sb.append(" | especie: ").append(especie);
        sb.append(" | idade: ").append(idade);
        sb.append("\n").append(tutor);

        return sb.toString();
    }

}
