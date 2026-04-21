/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.equipamento;

/**
 *
 * @author tomate
 */
public abstract class Equipamento {

    private String marca;
    private double valorBase;

    public Equipamento() {
    }

    public Equipamento(String marca, double valorBase) {
        this.marca = marca;
        this.valorBase = valorBase;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public abstract double calcularValorManutencao();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("marca: ").append(marca);
        sb.append("\nvalorBase: ").append(valorBase);
        return sb.toString();
    }

}
