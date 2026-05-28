/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.entidades;

/**
 *
 * @author Andreia
 */
public class Publico extends Funcionario{
    private long termoPosse;
    private final double INSS = 0.14;

    public Publico() {
    }

    public Publico(long termoPosse, String nome, String cpf, double salario) {
        super(nome, cpf, salario);
        this.termoPosse = termoPosse;
    }

    public long getTermoPosse() {
        return termoPosse;
    }

    public void setTermoPosse(long termoPosse) {
        this.termoPosse = termoPosse;
    }
    
    @Override
    public String toString(){
      return super.toString()
              + ", Nº do termo de posse: " + termoPosse;
    }

    @Override
    public double calcularInss() {
        return super.getSalario() * INSS;
    }
}
