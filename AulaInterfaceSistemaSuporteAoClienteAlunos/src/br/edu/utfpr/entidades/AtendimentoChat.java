/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.entidades;



/**
 *
 * @author Dell
 */
public class AtendimentoChat extends AtendimentoPorMeioEletronico {
    private String canal; // ex: WhatsApp, Messenger
    private int mensagensTroca;

    public AtendimentoChat(String canal, int mensagensTroca, String atendente, Cliente cliente) {
        super(  atendente, cliente);
        this.canal = canal;
        this.mensagensTroca = mensagensTroca;
    }



    public void setCanal(String canal) {
        this.canal = canal;
    }

    public void setMensagensTroca(int mensagensTroca) {
        this.mensagensTroca = mensagensTroca;
    }

    
    public String getCanal() {
        return canal;
    }

    public int getMensagensTroca() {
        return mensagensTroca;
    }

    @Override
    public String getTipoAtendimento() {
        return "Chat";
    }

    @Override
    public String toString() {
        return super.toString() +  " canal=" + canal + ", mensagensTroca=" + mensagensTroca;
    }
    
    
}
