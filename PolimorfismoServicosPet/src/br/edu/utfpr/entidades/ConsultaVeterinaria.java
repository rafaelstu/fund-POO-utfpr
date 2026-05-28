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
public class ConsultaVeterinaria extends Servico {

    private boolean retorno;

    public ConsultaVeterinaria(boolean retorno) {
        super();
        this.retorno = retorno;
    }

    public ConsultaVeterinaria(boolean retorno, String cliente, String pet, LocalDate agendamento, double preco) {
        super(cliente, pet, agendamento, preco);
        this.retorno = retorno;
    }

    public boolean isRetorno() {
        return retorno;
    }

    public void setRetorno(boolean retorno) {
        this.retorno = retorno;
    }

    @Override
    public double calcularPreco() {
        if (retorno) {
            return 0;
        }
        return 100;
    }

    @Override
    public String getTipoServico() {
        return "Consulta veterinária";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString());
        sb.append("\nretorno: ").append(retorno);

        return sb.toString();
    }

}
