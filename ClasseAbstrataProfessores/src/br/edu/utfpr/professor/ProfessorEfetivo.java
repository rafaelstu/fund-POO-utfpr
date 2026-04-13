/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.professor;

/**
 *
 * @author tomate
 */
public class ProfessorEfetivo extends Professor {

    private double adicionalTitulacao;
    private double salarioBase;

    public ProfessorEfetivo() {

    }

    public ProfessorEfetivo(String nome, String email, double adicionalTitulacao, double salarioBase) {
        super(nome, email);
        this.adicionalTitulacao = adicionalTitulacao;
        this.salarioBase = salarioBase;
    }

    public void setTitulacao(double adicionalTitulacao) {
        this.adicionalTitulacao = adicionalTitulacao;
    }

    public double getTitulacao() {
        return adicionalTitulacao;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    @Override
    public double calcularSalarioTotal() {
        return getTitulacao() + getSalarioBase();
    }

    @Override
    public String toString() {
        return super.toString() + "\nAdicional Titulação: " + getTitulacao() + "\nSalário Base: " + getSalarioBase();
    }
}
