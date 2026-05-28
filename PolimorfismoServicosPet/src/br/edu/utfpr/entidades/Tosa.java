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
public class Tosa extends Servico {

    private boolean incluiHigiene;

    public Tosa(boolean incluiHigiene) {
        super();
        this.incluiHigiene = incluiHigiene;
    }

    public Tosa(boolean incluiHigiene, String cliente, String pet, LocalDate agendamento, double preco) {
        super(cliente, pet, agendamento, preco);
        this.incluiHigiene = incluiHigiene;
    }

    public boolean isIncluiHigiene() {
        return incluiHigiene;
    }

    public void setIncluiHigiene(boolean incluiHigiene) {
        this.incluiHigiene = incluiHigiene;
    }

    @Override
    public double calcularPreco() {
        if (incluiHigiene) {
            return 60;
        }
        return 40;
    }

    @Override
    public String getTipoServico() {
        return "Tosa";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\nincluiHigiene: ").append(incluiHigiene ? "Sim" : "Não");

        return sb.toString();
    }

}
