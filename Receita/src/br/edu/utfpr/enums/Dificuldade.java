/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package br.edu.utfpr.enums;

/**
 *
 * @author tomate
 */
public enum Dificuldade {
    FACIL("Fácil"),
    MEDIA("Média"),
    DIFICIL("Difícil");

    private final String descricao;

    private Dificuldade(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
