/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.model;

import br.edu.utfpr.enums.Dificuldade;

/**
 *
 * @author tomate
 */
public class Salgado extends Receita {

    private String tipoProteina;

    public Salgado(String nome, int tempoPreparo, Dificuldade dificuldade, String tipoProteina) {
        super(nome, tempoPreparo, dificuldade);
        this.tipoProteina = tipoProteina;
    }

    public String getTipoProteina() {
        return tipoProteina;
    }

    public void setTipoProteina(String tipoProteina) {
        this.tipoProteina = tipoProteina;
    }

    @Override
    public String toString() {
        return super.toString() + " | Proteína: " + tipoProteina;
    }
}
