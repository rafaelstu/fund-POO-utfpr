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
public class Doce extends Receita {

    private boolean possuiAcucar;

    public Doce(String nome, int tempoPreparo, Dificuldade dificuldade, boolean possuiAcucar) {
        super(nome, tempoPreparo, dificuldade);
        this.possuiAcucar = possuiAcucar;
    }

    public boolean isPossuiAcucar() {
        return possuiAcucar;
    }

    public void setPossuiAcucar(boolean possuiAcucar) {
        this.possuiAcucar = possuiAcucar;
    }

    @Override
    public String toString() {
        return super.toString() + " | Possui Açúcar: " + (possuiAcucar ? "Sim" : "Não");
    }

}
