/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.entidades;

import br.edu.utfpr.exception.TrataIdade;
import java.time.LocalDate;

/**
 *
 * @author tomate
 */
public class Pessoa {

    private String nome;
    private int anoNasc;

    public Pessoa(String nome, int anoNasc) throws TrataIdade {
        this.nome = nome;

        if (!validarAno(anoNasc)) {
            throw new TrataIdade("o ano de nascimento deve estar entre 1900 e o ano atual");
        }
        this.anoNasc = anoNasc;
    }

    public int calcularIdade() {
        return LocalDate.now().getYear() - anoNasc;
    }

    public boolean validarAno(int anoNasc) {
        return (anoNasc >= 1900 && anoNasc <= LocalDate.now().getYear());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) throws TrataIdade {
        if (!validarAno(anoNasc)) {
            throw new TrataIdade("o ano de nascimento deve estar entre 1900 e o ano atual");
        }

        this.anoNasc = anoNasc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("\nPessoa: ").append(nome);
        sb.append(" | idade: ").append(calcularIdade());
        sb.append(" | anoNasc: ").append(anoNasc);
        return sb.toString();
    }

}
