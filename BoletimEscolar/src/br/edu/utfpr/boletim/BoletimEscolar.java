/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.boletim;

/**
 *
 * @author tomate
 */
public class BoletimEscolar {

    private String nome;
    private double[] notas;

    public BoletimEscolar() {
        notas = new double[4];
    }

    public BoletimEscolar(String nome, double[] notas) {
        this.nome = nome;
        this.notas = notas;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota(int i) {
        if (i >= 0 && i < 4) {
            return notas[i];
        }

        return -1;
    }

    public void setNota(int i, double v) {
        if (i < 0 || i > 3) {
            return;
        }

        notas[i] = v;
    }

    public double calcularMedia() {
        int s = 0;

        for (double n : notas) {
            s += n;
        }

        return s / notas.length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("boletim de ").append(nome).append("\n");

        sb.append("notas: ");

        for (int i = 0; i < notas.length; i++) {
            sb.append(notas[i]);
            if (i < notas.length - 1) {
                sb.append(", ");
            }
        }

        return sb.toString();
    }
}
