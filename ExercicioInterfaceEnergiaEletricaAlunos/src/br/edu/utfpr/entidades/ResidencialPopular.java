/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.entidades;

/**
 *
 * @author Dell
 */
public class ResidencialPopular extends Residencial {
    
   private boolean possuiTarifaSocial; 

    public ResidencialPopular(String nomeTitular, String numeroUnidade, double consumoMensal, int numeroMoradores, boolean possuiTarifaSocial) {
        super(nomeTitular, numeroUnidade, consumoMensal, numeroMoradores);
        this.possuiTarifaSocial = possuiTarifaSocial;
    }

    public boolean isPossuiTarifaSocial() {
        return possuiTarifaSocial;
    }

    public void setPossuiTarifaSocial(boolean possuiTarifaSocial) {
        this.possuiTarifaSocial = possuiTarifaSocial;
    }


    @Override
    public String toString() {
        return " (Residencial Popular)" + super.toString() +
               ", Tarifa Social: " + (possuiTarifaSocial ? "Sim" : "Não");
    }
}
