/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.musico;

import br.edu.utfpr.instrumento.Instrumento;

/**
 *
 * @author tomate
 */
public class Musico {

    private String nome;
    private Instrumento instrumento;

    public Musico() {
    }

    public Musico(String nome, Instrumento instrumento) {
        this.nome = nome;
        this.instrumento = instrumento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Instrumento getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(Instrumento instrumento) {
        this.instrumento = instrumento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Musico: ").append(nome);
        sb.append("\n").append(instrumento);

        return sb.toString();
    }

}
