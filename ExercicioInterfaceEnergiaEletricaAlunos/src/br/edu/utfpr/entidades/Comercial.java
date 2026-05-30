/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.entidades;

/**
 *
 * @author Dell
 */
public class Comercial extends Residencia {

    private String cnae; //código de atividade econômica

    public Comercial(String nomeTitular, String numeroUnidade, double consumoMensal, String cnae) {
        super(nomeTitular, numeroUnidade, consumoMensal);
        this.cnae = cnae;
    }

    public String getCnae() {
        return cnae;
    }

    public void setCnae(String cnae) {
        this.cnae = cnae;
    }

    @Override
    public double calculoEnergia() {

        double tarifa = super.getConsumoMensal() <= 200 ? 0.65 : 0.85;

        return tarifa * super.getConsumoMensal();

    }

    @Override
    public String toString() {
        return " (Comercial)" + super.toString()
                + ", CNAE: " + cnae;
    }
}
