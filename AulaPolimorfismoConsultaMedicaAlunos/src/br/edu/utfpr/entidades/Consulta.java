/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.entidades;

import java.time.LocalDateTime;

/**
 *
 * @author Dell
 */
public class Consulta {
     private Pessoa medico;
    private Pessoa paciente;
    private LocalDateTime dataHora;
    private double valor;

    public Consulta(Pessoa medico, Pessoa paciente, LocalDateTime dataHora, double valor) {
        this.medico = medico;
        this.paciente = paciente;
        this.dataHora = dataHora;
        this.valor = valor;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Pessoa getMedico() {
        return medico;
    }

    public Pessoa getPaciente() {
        return paciente;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return  "Médico:" + medico + ", paciente:" + paciente + ", data/hora=" + dataHora + ", valor=" + valor;
    }
    
    
}
