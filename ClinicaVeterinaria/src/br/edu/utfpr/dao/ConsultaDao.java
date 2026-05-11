/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.dao;

import br.edu.utfpr.entidades.Consulta;
import br.edu.utfpr.enums.StatusConsulta;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tomate
 */
public class ConsultaDao {

    private List<Consulta> consultas;

    public ConsultaDao() {
        this.consultas
                = new ArrayList<>();
    }

    public ConsultaDao(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    public void addConsulta(Consulta c) {
        consultas.add(c);
    }

    public boolean removeConsultaPorId(int id) {
        return consultas.removeIf(c -> c.getId() == id);
    }

    public String listarConsultas() {
        StringBuilder sb = new StringBuilder();

        consultas.forEach(c -> sb.append(c.toString()).append("\n"));

        return sb.toString();
    }

    public List<Consulta> buscaPorStatus(StatusConsulta status) {
        List<Consulta> filtradas = new ArrayList<>();

        this.consultas.forEach(c -> {
            if (c.getStatus().equals(status)) {
                filtradas.add(c);
            }
        });

        return filtradas;
    }

    public void cancelarConsultaPorId(int id) {
        for (Consulta c : consultas) {
            if (c.getId() == id) {

                c.setStatus(StatusConsulta.CANCELADA);
                return;
            }
        }
    }

    public void finalizarConsultaPorId(int id, String diagnostico, String tratamento) {

        for (Consulta c : consultas) {
            if (c.getId() == id) {

                c.getFicha().setDiagnostico(diagnostico);
                c.getFicha().setTratamento(tratamento);

                c.setStatus(StatusConsulta.REALIZADA);
                return;
            }
        }
    }

}
