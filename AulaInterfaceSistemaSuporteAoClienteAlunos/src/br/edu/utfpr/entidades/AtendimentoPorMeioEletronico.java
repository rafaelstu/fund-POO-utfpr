/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.entidades;

import br.edu.utfpr.interfaces.Atendimento;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Dell
 */
public abstract class AtendimentoPorMeioEletronico extends AtendimentoBase implements Atendimento {

    protected String status; //valor alterado pelos métodos abrir e fechar chamado
    private LocalDateTime dataAbertura;//valor alterado pelos métodos abrir e fechar chamado
    private LocalDateTime dataFechamento;//valor alterado pelos métodos abrir e fechar chamado
    private String descricao;
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public AtendimentoPorMeioEletronico(String atendente, Cliente cliente) {
        super(atendente, cliente);
        this.status = "Fechado";
        this.descricao = null;
        this.status = null;
        this.dataAbertura = null;
        this.dataFechamento = null;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public LocalDateTime getDataAbertura() {
        return dataAbertura;
    }

    public LocalDateTime getDataFechamento() {
        return dataFechamento;
    }

    @Override
    public void abrirChamado(String descricao) {
        this.descricao = descricao;
        this.status = "Aberto";
        this.dataAbertura = LocalDateTime.now();
    }

    @Override
    public void fecharChamado() {
        this.status = "Fechado";
        this.dataFechamento = LocalDateTime.now();
    }

    @Override
    public String toString() {
        String abertura = dataAbertura != null ? dataAbertura.format(FORMATTER) : "N/A";
        String fechamento = dataFechamento != null ? dataFechamento.format(FORMATTER) : "N/A";
        return super.toString() + "\nDescrição: " + descricao
                + ", Status: " + status
                + ", Abertura: " + abertura
                + (dataFechamento != null ? ", Fechamento: " + fechamento : "");
    }
}
