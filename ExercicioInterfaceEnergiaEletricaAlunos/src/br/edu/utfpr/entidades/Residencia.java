/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.entidades;

import br.edu.utfpr.interfaces.EnergiaEletrica;

/**
 *
 * @author Dell
 */
public abstract class Residencia implements EnergiaEletrica {

    private String nomeTitular;
    private String numeroUnidade;
    private double consumoMensal; // em kWh

    public Residencia(String nomeTitular, String numeroUnidade, double consumoMensal) {
        this.nomeTitular = nomeTitular;
        this.numeroUnidade = numeroUnidade;
        this.consumoMensal = consumoMensal;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getNumeroUnidade() {
        return numeroUnidade;
    }

    public void setNumeroUnidade(String numeroUnidade) {
        this.numeroUnidade = numeroUnidade;
    }

    public double getConsumoMensal() {
        return consumoMensal;
    }

    public void setConsumoMensal(double consumoMensal) {
        this.consumoMensal = consumoMensal;
    }

    @Override
    public String toString() {
        return "Titular: " + nomeTitular
                + ", Unidade: " + numeroUnidade
                + ", Consumo: " + consumoMensal + " kWh";
    }

}
