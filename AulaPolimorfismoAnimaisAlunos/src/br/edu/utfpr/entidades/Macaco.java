/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.entidades;

/**
 *
 * @author User
 */
public class Macaco extends Animal {

    public Macaco() {
    }

    public Macaco(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String getTipo() {
        return "Macaco";
    }

    @Override
    public String emitirSom() {
        return "hu hu hu";
    }

    public String subir() {
        return getTipo() + " subindo em árvores!";
    }

    @Override
    public double calcularQtdeAlimentoDiario() {
        //supondo que um macaco consuma 0.2kg de alimento por ano de vida com mínimo de 0.5kg
        double calculo = getIdade() * 0.2;
        return calculo < 0.5 ? 0.5 : calculo;
    }

}
