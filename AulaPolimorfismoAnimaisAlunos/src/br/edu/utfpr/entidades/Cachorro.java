/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.entidades;

/**
 *
 * @author User
 */
public class Cachorro extends Animal {

    public Cachorro() {

    }

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String getTipo() {
        return "Cachorro";
    }

    @Override
    public String emitirSom() {
        return "au au au";
    }

    public String correr() {
        return getTipo() + " correndo";
    }

    @Override
    public double calcularQtdeAlimentoDiario() {
        return super.getIdade() < 5 ? 0.2 : 0.4;
    }

}
