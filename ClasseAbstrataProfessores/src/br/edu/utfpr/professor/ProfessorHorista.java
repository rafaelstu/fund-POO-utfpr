/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.professor;

/**
 *
 * @author tomate
 */
public class ProfessorHorista extends Professor {

    private int qtdeHoras;
    private double valorHora;

    public ProfessorHorista() {

    }

    public ProfessorHorista(String nome, String email, int qtdeHoras, double valorHora) {
        super(nome, email);
        this.qtdeHoras = qtdeHoras;
        this.valorHora = valorHora;
    }

    public void setQtdeHoras(int qtdeHoras) {
        this.qtdeHoras = qtdeHoras;
    }

    public int getQtdeHoras() {
        return qtdeHoras;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getValorHora() {
        return valorHora;
    }

    @Override
    public double calcularSalarioTotal() {
        return getQtdeHoras() * getValorHora();
    }

    public String toString() {
        return super.toString() + "\nQuantidade de Horas: " + getQtdeHoras() + "\nValor da Hora: " + getValorHora();
    }
}
