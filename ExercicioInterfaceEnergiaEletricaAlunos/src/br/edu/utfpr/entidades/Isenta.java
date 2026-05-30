/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.entidades;

/**
 *
 * @author Dell
 */
public class Isenta extends Residencia {

    private String justificativaIsencao;

    public Isenta(String nomeTitular, String numeroUnidade, double consumoMensal, String justificativaIsencao) {
        super(nomeTitular, numeroUnidade, consumoMensal);
        this.justificativaIsencao = justificativaIsencao;
    }

    public String getJustificativaIsencao() {
        return justificativaIsencao;
    }

    public void setJustificativaIsencao(String justificativaIsencao) {
        this.justificativaIsencao = justificativaIsencao;
    }

    @Override
    public double calculoEnergia() {
        return 0;
    }

    @Override
    public String toString() {
        return " (Isenta de cobrança)" + super.toString()
                + ", Motivo: " + justificativaIsencao;
    }
}
