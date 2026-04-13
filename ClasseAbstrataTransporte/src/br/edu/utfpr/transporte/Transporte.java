/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.transporte;

/**
 *
 * @author tomate
 */
public abstract class Transporte {

    private double distancia;
    private double pesoCarga;
    private double capacidadeMaxima;

    public Transporte() {
        distancia = 0;
        pesoCarga = 0;
        capacidadeMaxima = 0;

    }

    public Transporte(double distancia, double capacidadeMaxima) {
        this.distancia = distancia;
        this.pesoCarga = 0;
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getPesoCarga() {
        return pesoCarga;
    }

    public double getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(double capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public boolean adicionarCarga(double peso) {
        if (pesoCarga + peso > capacidadeMaxima) {
            return false;
        }

        pesoCarga += peso;
        return true;
    }

    public boolean removerCarga(double peso) {
        if (peso > pesoCarga) {
            return false;
        }

        pesoCarga -= peso;
        return true;
    }

    public abstract double calcularCusto();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("distancia: ").append(distancia).append(" km");
        sb.append("\npesoCarga: ").append(pesoCarga).append(" kg");
        sb.append("\ncapacidadeMaxima: ").append(capacidadeMaxima).append(" kg");
        return sb.toString();
    }

}
