/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.dao;

import br.edu.utfpr.entidades.Consulta;
import br.edu.utfpr.entidades.Medico;
import br.edu.utfpr.entidades.Paciente;
import br.edu.utfpr.entidades.Pessoa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class ClinicaDao {

    private List<Paciente> pacientes;
    private List<Medico> medicos;
    private List<Consulta> consultas;

    public ClinicaDao() {
        pacientes = new ArrayList<>();
        medicos = new ArrayList<>();
        consultas = new ArrayList<>();
    }

    private boolean cpfExiste(String cpf, Pessoa pessoa) {
        if (pessoa instanceof Paciente) {
            for (Paciente p : pacientes) {
                if (p.getCpf().equals(cpf)) {
                    return true;
                }
            }
        } else if (pessoa instanceof Medico) {
            for (Medico m : medicos) {
                if (m.getCpf().equals(cpf)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void adicionarPessoa(Pessoa pessoa) {
        if (!cpfExiste(pessoa.getCpf(), pessoa)) {
            if (pessoa instanceof Paciente p) {
                pacientes.add(p);
            } else if (pessoa instanceof Medico m) {
                medicos.add(m);
            }
        }
    }

    public void adicionarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    public String exibirPacientes() {
        StringBuilder sb = new StringBuilder("=== Pacientes Cadastrados ===\n");
        pacientes.forEach(p -> sb.append(p).append("\n"));
        return sb.toString();
    }

    public String exibirMedicos() {
        StringBuilder sb = new StringBuilder("=== M�dicos Cadastrados ===\n");
        medicos.forEach(m -> sb.append(m).append("\n"));
        return sb.toString();
    }

    public String exibirConsultas() {
        StringBuilder sb = new StringBuilder("=== Consultas Agendadas ===\n");
        consultas.forEach(c
                -> sb.append("M�dico: ").append(c.getMedico().getNome())
                        .append(" | Paciente: ").append(c.getPaciente().getNome())
                        .append(" | Data/Hora: ").append(c.getDataHora())
                        .append(" | Valor: R$").append(c.getValor()).append("\n")
        );
        return sb.toString();
    }
}
