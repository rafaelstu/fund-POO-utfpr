/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.empresa;

/**
 *
 * @author tomate
 */
public class EmpresaIsenta extends Empresa {

    public EmpresaIsenta(String nome, String cnpj, double fatMensal) {
        super(nome, cnpj, fatMensal);
    }

    public EmpresaIsenta() {
        super();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n=EmpresaIsenta=\n");
        sb.append(super.toString());
        return sb.toString();
    }

}
