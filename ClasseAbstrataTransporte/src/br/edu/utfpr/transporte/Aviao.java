/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.transporte;

/**
 *
 * @author tomate
 */
public class Aviao extends Transporte {

    private double taxaFixa;

    public Aviao() {
    }

    public Aviao(double distancia, double capacidadeMaxima, double taxaFixa) {
        super(distancia, capacidadeMaxima);
        this.taxaFixa = taxaFixa;
    }

    public double getTaxaFixa() {
        return taxaFixa;
    }

    public void setTaxaFixa(double taxaFixa) {
        this.taxaFixa = taxaFixa;
    }

    @Override
    public double calcularCusto() {
        return (super.getDistancia() * 2.5) + (super.getPesoCarga() * 0.2) + taxaFixa;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\ntaxaFixa: R$ ").append(taxaFixa);
        return sb.toString();
    }

}
