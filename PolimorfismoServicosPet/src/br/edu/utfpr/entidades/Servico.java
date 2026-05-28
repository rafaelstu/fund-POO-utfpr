/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.entidades;

import java.time.LocalDate;

/**
 *
 * @author tomate
 */
public abstract class Servico {

    private int id;
    private static int contador = 0;

    private String cliente;
    private String pet;
    private LocalDate agendamento;
    private double preco;

    public Servico() {
        this.id = ++contador;
    }

    public Servico(String cliente, String pet, LocalDate agendamento, double preco) {
        this.id = ++contador;
        this.cliente = cliente;
        this.pet = pet;
        this.agendamento = agendamento;
        this.preco = preco;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getPet() {
        return pet;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }

    public LocalDate getAgendamento() {
        return agendamento;
    }

    public void setAgendamento(LocalDate agendamento) {
        this.agendamento = agendamento;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public abstract double calcularPreco();

    public abstract String getTipoServico();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("cliente: ").append(cliente);
        sb.append("\npet: ").append(pet);
        sb.append("\nagendamento: ").append(agendamento);
        sb.append("\npreco:").append(preco);

        return sb.toString();
    }

}
