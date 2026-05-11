/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.entidades;

import br.edu.utfpr.enums.StatusConsulta;
import java.time.LocalDate;

/**
 *
 * @author tomate
 */
public class Consulta {

    private static int contador = 0;
    private int id;

    private LocalDate data;
    private StatusConsulta status;
    private Veterinario vet;
    private Animal animal;
    private FichaDeAtendimento ficha;

    public Consulta() {
        this.data = LocalDate.now();
        this.status = StatusConsulta.AGENDADA;
        this.ficha = new FichaDeAtendimento();
        this.id = ++contador;
    }

    public Consulta(Veterinario vet, Animal animal) {
        this.vet = vet;
        this.animal = animal;
        this.data = LocalDate.now();
        this.status = StatusConsulta.AGENDADA;
        this.ficha = new FichaDeAtendimento();
        this.id = ++contador;

    }

    public int getId() {
        return id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public StatusConsulta getStatus() {
        return status;
    }

    public void setStatus(StatusConsulta status) {
        this.status = status;
    }

    public Veterinario getVet() {
        return vet;
    }

    public void setVet(Veterinario vet) {
        this.vet = vet;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public FichaDeAtendimento getFicha() {
        return ficha;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("id: ").append(id);
        sb.append("\ndata: ").append(data);
        sb.append("\n").append(vet);
        sb.append("\n").append(animal);
        sb.append("\nstatus: ").append(status);

        if (StatusConsulta.REALIZADA.equals(this.status)) {
            sb.append("\n").append(ficha);
        }

        return sb.toString();
    }

}
