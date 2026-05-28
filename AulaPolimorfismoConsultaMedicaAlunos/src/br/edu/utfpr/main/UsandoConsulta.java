/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.utfpr.main;

import br.edu.utfpr.dao.ClinicaDao;
import br.edu.utfpr.entidades.Consulta;
import br.edu.utfpr.entidades.Medico;
import br.edu.utfpr.entidades.Paciente;
import br.edu.utfpr.entidades.Pessoa;
import java.time.LocalDateTime;

/**
 *
 * @author Dell
 */
public class UsandoConsulta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa m1 = new Medico("Dr. Jo�o Silva", "111.111.111-11", "Cardiologia");
        Pessoa m2 = new Medico("Dra. Ana Souza", "222.222.222-22", "Dermatologia");

        Pessoa p1 = new Paciente("Maria Santos", "333.333.333-33", "Unimed");
        Pessoa p2 = new Paciente("Carlos Pereira", "444.444.444-44", "Bradesco Sa�de");
        Pessoa p3 = new Paciente("Carlos Pereira", "444.444.444-44", "Bradesco Sa�de");

        Consulta consulta1 = new Consulta(m1, p1, LocalDateTime.of(2026, 05, 15, 10, 0), 300.0);
        Consulta consulta2 = new Consulta(m2, p2, LocalDateTime.of(2026, 05, 16, 14, 30), 250.0);

        ClinicaDao dao = new ClinicaDao();

        dao.adicionarPessoa(p1);
        dao.adicionarPessoa(p2);
        dao.adicionarPessoa(p3);
        dao.adicionarPessoa(m1);
        dao.adicionarPessoa(m2);

        System.out.println(dao.exibirPacientes());
        System.out.println(dao.exibirMedicos());

        dao.adicionarConsulta(consulta1);
        dao.adicionarConsulta(consulta2);

        System.out.println(dao.exibirConsultas());
    }

}
