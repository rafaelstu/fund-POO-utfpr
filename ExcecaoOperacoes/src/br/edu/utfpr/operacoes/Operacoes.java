/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.operacoes;

import br.edu.utfpr.exception.TrataDivisaoPorZero;

/**
 *
 * @author tomate
 */
public class Operacoes {

    private double num1;
    private double num2;

    public Operacoes(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Operacoes() {
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double somar() {
        return num1 + num2;
    }

    public double dividir() throws TrataDivisaoPorZero {
        if (num2 == 0) {
            throw new TrataDivisaoPorZero("não pode dividir por 0");
        }

        return num1 / num2;
    }
}
