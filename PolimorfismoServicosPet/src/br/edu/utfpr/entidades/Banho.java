/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.entidades;

import br.edu.utfpr.enums.Porte;
import java.time.LocalDate;

/**
 *
 * @author tomate
 */
public class Banho extends Servico {

    private Porte porte;

    public Banho() {
        super();
    }

    public Banho(String cliente, String pet, LocalDate agendamento, double preco, Porte porte) {
        super(cliente, pet, agendamento, preco);
        this.porte = porte;
    }

    public Porte getPorte() {
        return porte;
    }

    public void setPorte(Porte porte) {
        this.porte = porte;
    }

    @Override
    public double calcularPreco() {
        return switch (this.porte) {
            case Porte.PEQUENO ->
                30;
            case Porte.MEDIO ->
                50;
            case Porte.GRANDE ->
                70;
            default ->
                40;
        };
    }

    @Override
    public String getTipoServico() {
        return "Banho";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString());
        sb.append("\nPorte: ").append(porte);

        return sb.toString();
    }

}
