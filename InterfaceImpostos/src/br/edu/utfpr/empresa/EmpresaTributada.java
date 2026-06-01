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
public abstract class EmpresaTributada extends Empresa implements Impostos {

    public EmpresaTributada(String nome, String cnpj, double fatMensal) {
        super(nome, cnpj, fatMensal);

    }

    public EmpresaTributada() {
        super();
    }

    public abstract double calcularTotalImpostos();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString());
        sb.append("\npis= ").append(calcularPis());
        sb.append("\ncofins= ").append(calcularCofins());
        sb.append("\ntotal impostos= ").append(calcularTotalImpostos());

        return sb.toString();
    }

}
