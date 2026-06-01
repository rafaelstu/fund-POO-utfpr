/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.entidades;

/**
 *
 * @author Dell
 */
public class AtendimentoPresencial extends AtendimentoBase{
     private String setor; 


    public AtendimentoPresencial(String setor,  String atendente, Cliente cliente) {
        super( atendente, cliente);
        this.setor = setor;
    }
    
    

    public void setSetor(String setor) {
        this.setor = setor;
    }

    
    public String getSetor() {
        return setor;
    }

    @Override
    public String getTipoAtendimento() {
        return "Presencial";
    }

    @Override
    public String toString() {
        return super.toString() + ", setor=" + setor ;
    }


    
    
}
