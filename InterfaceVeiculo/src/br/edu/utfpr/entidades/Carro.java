/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.entidades;

import br.edu.utfpr.interfaces.Veiculo;

/**
 *
 * @author tomate
 */
public class Carro implements Veiculo {

    private int combustivel;

    public Carro(int combustivel) {
        this.combustivel = combustivel;
    }

    public Carro() {
    }

    public int getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(int combustivel) {
        this.combustivel = combustivel;
    }

    @Override
    public int acelerar() {
        if (this.combustivel >= 2) {
            this.combustivel -= 2;
        }

        return this.combustivel;
    }

    @Override
    public void frear() {
        System.out.println("carro desacelerando");
    }

    @Override
    public int abastecer(int litros) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
