/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.model;

/**
 *
 * @author tomate
 */
public class Guia extends Pessoa {

    private int registro;
    private String telefone;

    public Guia(int registro, String telefone, String nome) {
        super(nome);
        this.registro = registro;
        this.telefone = telefone;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Guia: ").append(super.getNome());
        sb.append(" | registro: ").append(registro);
        sb.append(" | telefone: ").append(telefone);
        return sb.toString();
    }

}
