/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.utfpr.main;

import br.edu.utfpr.dao.ConsultaDao;
import br.edu.utfpr.entidades.Animal;
import br.edu.utfpr.entidades.Consulta;
import br.edu.utfpr.entidades.Tutor;
import br.edu.utfpr.entidades.Veterinario;

/**
 *
 * @author tomate
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConsultaDao cd = new ConsultaDao();

        Veterinario v1 = new Veterinario("Dra. Ana Souza", "ana@vet.com", 12345);
        Veterinario v2 = new Veterinario("Dra. Maria Andrade", "maria@vet.com", 67890);

        Tutor t1 = new Tutor("Carlos Silva", "99999-9999", "Rua dos Bobos, 0");

        Animal a1 = new Animal("Rex", "Vira-Lata", 12, t1);

        Consulta c1 = new Consulta();
    }

}
