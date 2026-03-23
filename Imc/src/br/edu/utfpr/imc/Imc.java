/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.imc;

/**
 *
 * @author tomate
 */
public class Imc {

    private double peso, altura;

    public Imc() {
    }

    public Imc(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularImc() {
        if (peso == 0 || altura == 0) {
            return 0;
        }
        return peso / (altura * altura);
    }

    public String classificacaoImc(double valorImc) {
        if (valorImc < 20) {
            return "magro";
        }
        if (valorImc <= 24) {
            return "normal";
        }
        if (valorImc <= 29) {
            return "acima do peso";
        }
        if (valorImc <= 34) {
            return "obeso";
        }
        return "muito obeso";
    }

    @Override
    public String toString() {
        return "peso: " + peso + "\naltura: " + altura;
    }
}
