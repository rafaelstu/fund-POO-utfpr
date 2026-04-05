/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.model;

/**
 *
 * @author tomate
 */
public class Aluno extends Pessoa {

    private int matricula;

    public Aluno() {
    }

    public Aluno(int idade, String nome, int matricula) {
        super(idade, nome);
        this.matricula = matricula;

    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return super.toString() + "\nmatricula: " + matricula;
    }
}
