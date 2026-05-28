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
public abstract class Funcionario {
    
    private String nome;
    private String cpf;
    private double salario;
    
    public Funcionario(){
    }
    
    public Funcionario(String nome, String cpf, double salario){
       this.nome = nome;
       this.cpf = cpf;
       this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    public abstract double calcularInss();
    
    @Override
    public String toString(){
        return "Nome: " + nome + ", CPF: " + cpf + ", Salário: " + salario;
    }
}
