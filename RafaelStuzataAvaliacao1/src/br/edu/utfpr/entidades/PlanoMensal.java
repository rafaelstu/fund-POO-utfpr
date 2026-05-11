/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.entidades;

/**
 *
 * @author Dell
 */
public class PlanoMensal extends Plano {

    private double valorMensal;
    private final double TAXA = 50;

    public PlanoMensal() {
        super();
    }

    //crie o construtor com par�metros
    public PlanoMensal(double valorMensal, String nome, Cliente cliente) {
        super(nome, cliente);
        this.valorMensal = valorMensal;
    }

    public double getValorMensal() {
        return valorMensal;
    }

    public void setValorMensal(double valorMensal) {
        this.valorMensal = valorMensal;
    }

    //implemente o m�todo abstrato herdado da superclasse
    @Override
    public double calcularValorFinal() {
        return valorMensal + TAXA;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", valor mensal:" + valorMensal;
    }

}
