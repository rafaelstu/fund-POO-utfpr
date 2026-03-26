/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.quadrilatero;

/**
 *
 * @author tomate
 */
public class Quadrilatero {

    private int lado1, lado2;

    public Quadrilatero() {
    }

    public Quadrilatero(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        if (lado1 > 0) {
            this.lado1 = lado1;
        }
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        if (lado2 > 0) {
            this.lado2 = lado2;
        }
    }

    public double getAreaPlana() {
        return lado1 * lado2;
    }

    public double getPerimetro() {
        return (lado1 * 2) + (lado2 * 2);
    }

    public boolean isQuadrado() {
        return lado1 == lado2;
    }

    public boolean isRetangulo() {
        return !isQuadrado();
    }

    @Override
    public String toString() {
        return "lado1: " + lado1 + "\nlado2: " + lado2;
    }

}
