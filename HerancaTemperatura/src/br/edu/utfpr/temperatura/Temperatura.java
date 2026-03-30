/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.temperatura;

/**
 *
 * @author tomate
 */
public class Temperatura {

    private String cidade;
    private double[] temperaturas;

    public Temperatura() {
        temperaturas = new double[7]; //cria o array
    }

    public Temperatura(String cidade, double[] temperaturas) {
        this.cidade = cidade;
        this.temperaturas = temperaturas;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public double[] getTemperaturas() {
        return temperaturas;
    }

    public void setTemperaturas(int i, double valor) {
        if (i >= 0 && i < temperaturas.length) {
            temperaturas[i] = valor;
        }
    }

    public double getTemperatura(int i) {
        if (i >= 0 && i < temperaturas.length) {
            return temperaturas[i];
        }
        return -999; //valor de erro
    }

    public double calcularMedia() {
        double soma = 0;

        for (double t : temperaturas) {
            soma += t;
        }

        return soma / temperaturas.length;
    }

    public double maiorTemperatura() {
        double maior = temperaturas[0];

        for (double t : temperaturas) {
            if (t > maior) {
                maior = t;
            }
        }

        return maior;
    }

    public double menorTemperatura() {
        double menor = temperaturas[0];

        for (double t : temperaturas) {
            if (t < menor) {
                menor = t;
            }
        }

        return menor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("registros de temperaturas de ").append(cidade).append(":\n");
        sb.append("temperaturas da semana: ");

        for (int i = 0; i < temperaturas.length; i++) {
            sb.append(temperaturas[i]);
            if (i < temperaturas.length - 1) {
                sb.append(", ");
            }
        }

        return sb.toString();
    }
}
