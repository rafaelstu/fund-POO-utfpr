/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.entidades;



/**
 *
 * @author Dell
 */
public class AtendimentoEmail extends AtendimentoPorMeioEletronico{
     private int prioridade; // 1 = baixa, 5 = alta
    private boolean possuiAnexos;

    public AtendimentoEmail(int prioridade, boolean possuiAnexos,  String atendente, Cliente cliente) {
        super(  atendente, cliente);
        this.prioridade = prioridade;
        this.possuiAnexos = possuiAnexos;
    }



    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public void setPossuiAnexos(boolean possuiAnexos) {
        this.possuiAnexos = possuiAnexos;
    }
    

    public int getPrioridade() {
        return prioridade;
    }

    public boolean hasAnexos() {
        return possuiAnexos;
    }

    @Override
    public String getTipoAtendimento() {
        return "Email";
    }

@Override
public String toString() {
    return super.toString()
        + ", prioridade: " + prioridade
        + ", possui anexos? " + (possuiAnexos ? "Sim" : "Não");
}
    
}
