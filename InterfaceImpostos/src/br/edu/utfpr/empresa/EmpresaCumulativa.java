/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.empresa;

/**
 *
 * @author tomate
 */
public class EmpresaCumulativa extends EmpresaTributada {

    public EmpresaCumulativa(String nome, String cnpj, double fatMensal) {
        super(nome, cnpj, fatMensal);
    }

    public EmpresaCumulativa() {
        super();
    }

    @Override
    public double calcularPis() {
        return super.getFatMensal() * 0.0065;

    }

    @Override
    public double calcularCofins() {
        return super.getFatMensal() * 0.03;
    }

    @Override
    public double calcularTotalImpostos() {
        return calcularCofins() + calcularPis();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n=EmpresaCumulativa=\n");
        sb.append(super.toString());
        return sb.toString();
    }

}
