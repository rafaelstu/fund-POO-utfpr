/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.funcionarios;

/**
 *
 * @author tomate
 */
public class Gerente extends Funcionario {

    private String login, senha;

    public Gerente() {
        super();
    }

    public Gerente(String nome, double salario, String login, String senha) {
        super(nome, salario);
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double calcularBonificacao() {
        return super.getSalario() * 0.1;
    }

    public double calcularSalarioTotal() {
        return super.getSalario() + calcularBonificacao();
    }

    @Override
    public String toString() {
        return super.toString() + "\nlogin: " + login + "\nsenha: " + senha;
    }
}
