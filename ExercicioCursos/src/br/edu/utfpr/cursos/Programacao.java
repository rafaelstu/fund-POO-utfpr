/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.cursos;

/**
 *
 * @author tomate
 */
public class Programacao extends Cursos {

    private String linguagem;
    private double custoMatDidatico;
    private double custoHoraInstrutor;

    public Programacao() {

    }

    public Programacao(String titulo, String instrutor, int duracaoHoras, String linguagem, double custoMatDidatico, double custoHoraInstrutor) {
        super(titulo, instrutor, duracaoHoras);
        this.linguagem = linguagem;
        this.custoMatDidatico = custoMatDidatico;
        this.custoHoraInstrutor = custoHoraInstrutor;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setCustoMatDidatico(double custoMatDidatico) {
        this.custoMatDidatico = custoMatDidatico;
    }

    public double getCustoMatDidatico() {
        return custoMatDidatico;
    }

    public void setCustoHoraInstrutor(double custoHoraInstrutor) {
        this.custoHoraInstrutor = custoHoraInstrutor;
    }

    public double getCustoHoraInstrutor() {
        return custoHoraInstrutor;
    }

    @Override
    public double calcularCustoTotal() {
        return getCustoMatDidatico() + (getCustoHoraInstrutor() * super.getDuracaoHoras());
    }

    @Override
    public String toString() {
        return super.toString() + "\nCusto do material: " + getCustoMatDidatico() + "\nCusto da hora do instrutor: "
                + getCustoHoraInstrutor() + "\nLinguagem: " + getLinguagem();
    }
}
