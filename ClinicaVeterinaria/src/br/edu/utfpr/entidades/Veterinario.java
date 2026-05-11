/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.entidades;

/**
 *
 * @author tomate
 */
public class Veterinario {

    private String nome;
    private String email;
    private int crmv;

    public Veterinario() {
    }

    public Veterinario(String nome, String email, int crmv) {
        this.nome = nome;
        this.email = email;
        this.crmv = crmv;
    }

    public int getCrmv() {
        return crmv;
    }

    public void setCrmv(int crmv) {
        this.crmv = crmv;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Veterinario: ").append(nome);
        sb.append(" | CRMV: ").append(crmv);
        sb.append(" | email: ").append(email);

        return sb.toString();
    }

}
