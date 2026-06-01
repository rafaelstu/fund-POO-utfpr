/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.entidades;


public abstract class AtendimentoBase {
    private String atendente;
    private Cliente cliente;

    public AtendimentoBase( String atendente, Cliente cliente) {
        this.atendente = atendente;
        this.cliente = cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

   public void setAtendente(String nomeAtendente) {
        this.atendente = nomeAtendente;
    }
 
    public String getAtendente() {
        return atendente;
    }


    public Cliente getCliente() {
        return cliente;
    }


    public abstract String getTipoAtendimento();

    @Override
    public String toString() {
        return "Atendente:" + atendente + "\nCliente:" + cliente ;
    }
    
    
}
