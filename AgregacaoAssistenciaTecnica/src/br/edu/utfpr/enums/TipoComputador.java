/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package br.edu.utfpr.enums;

/**
 *
 * @author tomate
 */
public enum TipoComputador {
    DESKTOP("Computador de mesa, geralmente utilizado em escritórios e residências"),
    NOTEBOOK("Computador portátil, indicado para mobilidade"),
    SERVIDOR("Computador de alto desempenho utilizado para fornecer serviços em rede");

    private final String descricao;

    private TipoComputador(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
