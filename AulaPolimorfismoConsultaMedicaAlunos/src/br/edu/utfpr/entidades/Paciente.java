/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.entidades;

/**
 *
 * @author Dell
 */
public class Paciente extends Pessoa{
     private String planoSaude;

    public Paciente(String nome, String cpf, String planoSaude) {
        super(nome, cpf);
        this.planoSaude = planoSaude;
    }

    public void setPlanoSaude(String planoSaude) {
        this.planoSaude = planoSaude;
    }

    public String getPlanoSaude() {
        return planoSaude;
    }

    @Override
    public String toString() {
        return super.toString() + ", plano de saúde: " + planoSaude;
    }

    @Override
    public String getTipo() {
        return "Paciente";
    }
}
