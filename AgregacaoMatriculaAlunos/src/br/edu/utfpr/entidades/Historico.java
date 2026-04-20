/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.entidades;

import br.edu.utfpr.enums.Situacao;
import java.time.LocalDate;

/**
 *
 * @author Dell
 */
public class Historico {

    private LocalDate dataCriacao;
    private String observacao;
    private Aluno aluno;
    private Situacao situacao;

    public Historico(String observacao, Aluno aluno, Situacao situacao) {
        this.dataCriacao = LocalDate.now();
        this.observacao = observacao;
        this.aluno = aluno;
        this.situacao = situacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\ndata: ").append(dataCriacao);
        sb.append("\nobservacao: ").append(observacao);
        sb.append("\nsituacao: ").append(situacao);
        return sb.toString();
    }

}
