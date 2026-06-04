/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.entidades;

import br.edu.utfpr.interfaces.Evento;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tomate
 */
public class EventoCultural implements Evento {

    private String nome;
    private int capacidade;
    private List<Participante> participantesRegistrados;

    public EventoCultural(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.participantesRegistrados = new ArrayList<>();

    }

    public EventoCultural() {
        this.participantesRegistrados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public List<Participante> getParticipantesRegistrados() {
        return participantesRegistrados;
    }

    @Override
    public boolean adicionarParticipante(Participante participante) {

        if (verificarParticipante(participante) || verificarLotacao()) {
            return false;
        }

        participantesRegistrados.add(participante);
        return true;

    }

    @Override
    public boolean verificarLotacao() {
        return this.capacidade == participantesRegistrados.size();
    }

    @Override
    public boolean verificarParticipante(Participante participante) {
        boolean existe = false;

        for (Participante p : participantesRegistrados) {
            if (p.getNome().equals(participante.getNome())) {
                existe = true;
            }
        }

        return existe;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EventoCultural= ").append(nome);
        sb.append("\ncapacidade= ").append(capacidade);
        sb.append("\nparticipantes registrados= ").append(participantesRegistrados.size());
        return sb.toString();
    }

}
