/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.entidades;

/**
 *
 * @author Dell
 */
public class Cliente {
     private String nome;
    private String email;
    private String telefone;
    private boolean vip;

    public Cliente(String nome, String email, String telefone, boolean vip) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.vip = vip;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public boolean isVip() {
        return vip;
    }

@Override
public String toString() {
    return "Nome: " + nome
        + ", Email: " + email
        + ", Telefone: " + telefone
        + ", VIP: " + (vip ? "Sim" : "Não");
}
    
    
}
