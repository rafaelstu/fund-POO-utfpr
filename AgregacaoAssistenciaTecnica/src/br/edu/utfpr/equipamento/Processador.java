/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.equipamento;

/**
 *
 * @author tomate
 */
public class Processador {

    private String modelo;
    private double velocidade;

    public Processador() {
    }

    public Processador(String modelo, double velocidade) {
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nProcessador: ").append(modelo);
        sb.append("\nvelocidade: ").append(velocidade).append(" GHz");
        return sb.toString();
    }

}
