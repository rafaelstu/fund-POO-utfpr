/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.equipamento;

import br.edu.utfpr.cliente.Cliente;
import br.edu.utfpr.enums.TipoComputador;

/**
 *
 * @author tomate
 */
public class Computador extends Equipamento {

    private Processador processador;
    private Cliente cliente;
    private TipoComputador tipo;

    public Computador() {
    }

    public Computador(String marca, Cliente cliente, TipoComputador tipo,
            String modeloProc, double velocidade, double valorBase) {

        super(marca, valorBase);
        this.cliente = cliente;
        this.processador = new Processador(modeloProc, velocidade);
        this.tipo = tipo;

    }

    public Processador getProcessador() {
        return processador;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public TipoComputador getTipo() {
        return tipo;
    }

    public void setTipo(TipoComputador tipo) {
        this.tipo = tipo;
    }

    @Override
    public double calcularValorManutencao() {
        double valor;

        switch (tipo) {
            case DESKTOP:
                valor = super.getValorBase() * 0.1;
                break;
            case NOTEBOOK:
                valor = super.getValorBase() * 0.15;

                break;
            case SERVIDOR:
                valor = super.getValorBase() * 0.2;
                break;
            default:
                valor = 0;
        }

        return valor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(processador);
        sb.append(cliente);
        sb.append("\ntipo: ").append(tipo).append(" - ").append(tipo.getDescricao());
        return sb.toString();
    }

}
