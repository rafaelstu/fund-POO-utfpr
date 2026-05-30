/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.entidades;

/**
 *
 * @author Dell
 */
public class Residencial extends Residencia {

    private int numeroMoradores;

    public Residencial(String nomeTitular, String numeroUnidade, double consumoMensal, int numeroMoradores) {
        super(nomeTitular, numeroUnidade, consumoMensal);
        this.numeroMoradores = numeroMoradores;
    }

    public int getNumeroMoradores() {
        return numeroMoradores;
    }

    public void setNumeroMoradores(int numeroMoradores) {
        this.numeroMoradores = numeroMoradores;
    }

    @Override
    public double calculoEnergia() {

        double tarifa = super.getConsumoMensal() <= 200 ? 0.45 : 0.60;

        return tarifa * super.getConsumoMensal();

    }

    @Override
    public String toString() {
        return " (Residencial)" + super.toString()
                + ", Moradores: " + numeroMoradores;
    }
}
