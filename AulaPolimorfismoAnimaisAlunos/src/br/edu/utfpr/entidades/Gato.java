/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.entidades;

/**
 *
 * @author User
 */
public class Gato extends Animal {

    public Gato() {
    }

    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String getTipo() {
        return "Gato";
    }

    @Override
    public String emitirSom() {
        return "miau miau";
    }

    public String correr() {
        return getTipo() + " correndo";
    }

    @Override
    public double calcularQtdeAlimentoDiario() {
        return 0.3;
    }

}
