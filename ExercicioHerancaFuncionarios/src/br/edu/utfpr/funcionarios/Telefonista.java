/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.funcionarios;

/**
 *
 * @author tomate
 */
public class Telefonista extends Funcionario {

    private int ramal;

    public Telefonista() {
        super();
    }

    public Telefonista(String nome, double salario, int ramal) {
        super(nome, salario);
        this.ramal = ramal;
    }

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }

    public double calcularBonificacao() {
        return super.getSalario() * 0.05;
    }

    public double calcularSalarioTotal() {
        return super.getSalario() + calcularBonificacao();
    }

    @Override
    public String toString() {
        return super.toString() + "\nramal: " + ramal;
    }

}
