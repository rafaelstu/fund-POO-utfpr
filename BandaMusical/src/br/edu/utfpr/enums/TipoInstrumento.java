/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package br.edu.utfpr.enums;

/**
 *
 * @author tomate
 */
public enum TipoInstrumento {
    CORDA("Instrumento de corda, como violão, violino, guitarra."),
    SOPRO("Instrumento de sopro."),
    PERCUSSAO("Instrumento de percussão, como bateria, tambor, pandeiro.");

    private final String descricao;

    private TipoInstrumento(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
