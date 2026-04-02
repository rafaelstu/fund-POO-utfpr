/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.temperatura;

/**
 *
 * @author tomate
 */
public class TemperaturaLab extends Temperatura {

    private double limiteTemperatura;

    public TemperaturaLab() {
        super();
    }

    public TemperaturaLab(String cidade, double[] temperaturas, double limiteTemperatura) {
        super(cidade, temperaturas);
        this.limiteTemperatura = limiteTemperatura;
    }

    public double getLimiteTemperatura() {
        return limiteTemperatura;

    }

    public void setLimiteTemperatura(double limiteTemperatura) {
        this.limiteTemperatura = limiteTemperatura;
    }

    public boolean isSeguro() {
        return super.maiorTemperatura() <= limiteTemperatura;
    }

    @Override
    public String toString() {
        return super.toString() + "\nlimite máximo: " + limiteTemperatura;
    }
}
