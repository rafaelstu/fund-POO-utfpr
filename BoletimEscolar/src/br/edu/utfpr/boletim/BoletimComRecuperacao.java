/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.boletim;

/**
 *
 * @author tomate
 */
public class BoletimComRecuperacao extends BoletimEscolar {

    private double notaRec;

    public BoletimComRecuperacao() {
        super();
    }

    public BoletimComRecuperacao(String nome, double[] notas, double notaRec) {
        super(nome, notas);
        this.notaRec = notaRec;
    }

    public void setNotaRec(double notaRec) {
        this.notaRec = notaRec;
    }

    public double getNotaRec() {
        return notaRec;
    }

    public double calcularMediaFinal() {
        double m = super.calcularMedia();

        if (m >= 7) {
            return m;
        }

        return (m + notaRec) / 2;
    }

    public String verificarAprovacao() {
        return calcularMediaFinal() >= 7 ? "Aprovado após recuperação" : "Reprovado após recuperação";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString());
        sb.append("\nnota da recuperação: ").append(notaRec);

        return sb.toString();
    }
}
