/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.empresa;

import br.edu.utfpr.interfaces.Impostos;

/**
 *
 * @author tomate
 */
public abstract class Empresa {

    private String nome;
    private String cnpj;
    private double fatMensal;

    public Empresa(String nome, String cnpj, double fatMensal) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.fatMensal = fatMensal;
    }

    public Empresa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double getFatMensal() {
        return fatMensal;
    }

    public void setFatMensal(double fatMensal) {
        this.fatMensal = fatMensal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("nome= ").append(nome);
        sb.append("\ncnpj= ").append(cnpj);
        sb.append("\nfaturamento mensal= ").append(fatMensal);

        return sb.toString();
    }

}
