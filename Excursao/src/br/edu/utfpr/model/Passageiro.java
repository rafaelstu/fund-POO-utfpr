/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.model;

/**
 *
 * @author tomate
 */
public class Passageiro extends Pessoa {

    private static int contador = 0;
    private int id;

    private String documeto;
    private int idade;

    public Passageiro() {
        super();
        this.id = ++contador;
    }

    public Passageiro(String documeto, int idade, String nome) {
        super(nome);
        this.id = ++contador;

        this.documeto = documeto;
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public String getDocumeto() {
        return documeto;
    }

    public void setDocumeto(String documeto) {
        this.documeto = documeto;
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
        sb.append("Passageiro: ").append(super.getNome());
        sb.append(" | documeto: ").append(documeto);
        sb.append(" | idade: ").append(idade);

        return sb.toString();
    }

}
