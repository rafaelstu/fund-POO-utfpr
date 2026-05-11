/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.entidades;

/**
 *
 * @author Dell
 */
public class PlanoAnual extends Plano {

    private int desconto;
    private double valorBaseAnual;

    public PlanoAnual() {
        super();
    }

    //crie o construtor com par�metros
    public PlanoAnual(int desconto, double valorBaseAnual, String nome, Cliente cliente) {
        super(nome, cliente);
        this.desconto = desconto;
        this.valorBaseAnual = valorBaseAnual;
    }

    public double getValorBaseAnual() {
        return valorBaseAnual;
    }

    public void setValorBaseAnual(double valorBaseAnual) {
        this.valorBaseAnual = valorBaseAnual;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    //implemente o m�todo abstrato herdado da superclasse
    @Override
    public double calcularValorFinal() {
        return valorBaseAnual - ((valorBaseAnual * desconto) / 100);
    }

    @Override
    public String toString() {
        return super.toString()
                + ", valor base anual:" + valorBaseAnual
                + ", desconto:" + desconto + "%";

    }

}
