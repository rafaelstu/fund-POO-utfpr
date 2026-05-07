/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tomate
 */
public class Excursao {

    private String destino;
    private LocalDate data;
    private Guia guiaResponsavel;
    private Veiculo veiculo;
    private List<Passageiro> passageiros;

    public Excursao() {
        this.passageiros = new ArrayList<>();
    }

    public Excursao(String destino, LocalDate data,
            Guia guiaResponsavel, Veiculo veiculo,
            List<Passageiro> passageiros) {
        this.destino = destino;
        this.data = data;
        this.guiaResponsavel = guiaResponsavel;
        this.veiculo = veiculo;
        this.passageiros = new ArrayList<>();
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Guia getGuiaResponsavel() {
        return guiaResponsavel;
    }

    public void setGuiaResponsavel(Guia guiaResponsavel) {
        this.guiaResponsavel = guiaResponsavel;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public List<Passageiro> getPassageiros() {
        return passageiros;
    }

    public String imprimePassageiros() {
        StringBuilder sb = new StringBuilder();

        passageiros.forEach(p -> sb.append(p).append("\n"));

        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("destino: ").append(destino);
        sb.append("\ndata: ").append(data);
        sb.append("\n").append(guiaResponsavel);
        sb.append("\nveiculo: ").append(veiculo);
        sb.append("passageiros: ");

        passageiros.forEach(p -> sb.append(p).append("\n"));

        return sb.toString();
    }

}
