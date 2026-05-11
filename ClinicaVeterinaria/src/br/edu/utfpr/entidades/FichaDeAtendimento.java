/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.entidades;

/**
 *
 * @author tomate
 */
public class FichaDeAtendimento {

    private String diagnostico;
    private String tratamento;

    public FichaDeAtendimento() {
    }

    public FichaDeAtendimento(String diagnostico, String tratamento) {
        this.diagnostico = diagnostico;
        this.tratamento = tratamento;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamento() {
        return tratamento;
    }

    public void setTratamento(String tratamento) {
        this.tratamento = tratamento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("diagnostico: ").append(diagnostico);
        sb.append(" | tratamento: ").append(tratamento);

        return sb.toString();
    }

}
