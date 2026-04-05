/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.model;

/**
 *
 * @author tomate
 */
public class Servidor extends Pessoa {

    private int siape;

    public Servidor() {
    }

    public Servidor(int idade, String nome, int siape) {
        super(idade, nome);
        this.siape = siape;

    }

    public int getSiape() {
        return siape;
    }

    public void setSiape(int siape) {
        this.siape = siape;
    }

    @Override
    public String toString() {
        return super.toString() + "\nsiape: " + siape;
    }
}
