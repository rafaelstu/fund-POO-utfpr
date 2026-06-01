/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.entidades;

/**
 *
 * @author Dell
 */
public class AtendimentoTelefone extends AtendimentoBase{
     private int duracaoMinutos;
    private boolean retornoNecessario;

    public AtendimentoTelefone(int duracaoMinutos, boolean retornoNecessario, String atendente, Cliente cliente) {
        super( atendente, cliente);
        this.duracaoMinutos = duracaoMinutos;
        this.retornoNecessario = retornoNecessario;
    }



    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public void setRetornoNecessario(boolean retornoNecessario) {
        this.retornoNecessario = retornoNecessario;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public boolean isRetornoNecessario() {
        return retornoNecessario;
    }

    @Override
    public String getTipoAtendimento() {
        return "Telefone";
    }

    @Override
    public String toString() {
        return super.toString() +  ", duração em minutos:" + duracaoMinutos + ", retorno necessário=" + retornoNecessario + '}';
    }
    
    
}
