/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.entidades;

/**
 *
 * @author Andreia
 */
public class Privado extends Funcionario{
    
    private long ctps;
    private final double INSS = 0.11;
    private final double FGTS = 0.08;

    public Privado() {
    }

    public Privado(long ctps, String nome, String cpf, double salario) {
        super(nome, cpf, salario);
        this.ctps = ctps;
    }

    public long getCtps() {
        return ctps;
    }

    public void setCtps(long ctps) {
        this.ctps = ctps;
    }

    @Override
    public String toString() {
        return super.toString()+  ", CTPS: " + ctps;
    }

    @Override
    public double calcularInss() {
        return super.getSalario() * INSS;
    }
    
    public double calcularFgts(){
       return super.getSalario() * FGTS;
    }
    
    
}
