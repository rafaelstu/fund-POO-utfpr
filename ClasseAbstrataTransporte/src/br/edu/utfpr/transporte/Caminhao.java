/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.transporte;

/**
 *
 * @author tomate
 */
public class Caminhao extends Transporte {

    private double custoPorKm;

    public Caminhao() {
        super();
        custoPorKm = 0;
    }

    public Caminhao(double distancia, double capacidadeMaxima, double custoPorKm) {
        super(distancia, capacidadeMaxima);
        this.custoPorKm = custoPorKm;
    }

    public double getCustoPorKm() {
        return custoPorKm;
    }

    public void setCustoPorKm(double custoPorKm) {
        this.custoPorKm = custoPorKm;
    }

    @Override
    public double calcularCusto() {
        return super.getDistancia() * custoPorKm + (super.getPesoCarga() * 0.05);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\ncustoPorKm: R$ ").append(custoPorKm);
        return sb.toString();
    }
}
