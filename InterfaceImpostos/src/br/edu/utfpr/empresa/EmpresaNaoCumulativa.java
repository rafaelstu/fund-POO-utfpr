/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.empresa;

/**
 *
 * @author tomate
 */
public class EmpresaNaoCumulativa extends EmpresaTributada {

    public EmpresaNaoCumulativa(String nome, String cnpj, double fatMensal) {
        super(nome, cnpj, fatMensal);
    }

    public EmpresaNaoCumulativa() {
        super();
    }

    @Override
    public double calcularPis() {
        return super.getFatMensal() * 0.0165;

    }

    @Override
    public double calcularCofins() {
        return super.getFatMensal() * 0.076;
    }

    @Override
    public double calcularTotalImpostos() {
        return calcularCofins() + calcularPis();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n=EmpresaNaoCumulativa=\n");
        sb.append(super.toString());
        return sb.toString();
    }
}
