/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.instrumento;

import br.edu.utfpr.enums.TipoInstrumento;

/**
 *
 * @author tomate
 */
public class Instrumento {

    private String nome;
    private TipoInstrumento tipo;

    public Instrumento() {
    }

    public Instrumento(String nome, TipoInstrumento tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoInstrumento getTipo() {
        return tipo;
    }

    public void setTipo(TipoInstrumento tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Instrumento: ").append(nome);
        sb.append("\ntipo: ").append(tipo);
        sb.append("\ndescricao: ").append(tipo.getDescricao());

        return sb.toString();
    }

}
