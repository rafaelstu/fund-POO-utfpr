/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.entidades;

/**
 *
 * @author Dell
 */
public abstract class Plano {

    private static int contador;
    private int id;

    private String nome;
    private int quantidadeAulas;
    private Cliente cliente;

    public Plano(String nome, Cliente cliente) {
        this.id = ++contador;
        this.nome = nome;
        this.quantidadeAulas = 0;
        this.cliente = cliente;
    }

    public Plano() {
        this.id = ++contador;
        this.quantidadeAulas = 0;

    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeAulas() {
        return quantidadeAulas;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void adicionarAulas(int quant) {
        if (quant >= 0) {
            this.quantidadeAulas += quant;

        }
    }

    public boolean usarAula(int quant) {
        if (quant >= 0 && this.quantidadeAulas >= quant) {
            this.quantidadeAulas -= quant;
            return true;
        }
        return false;
    }

    public abstract double calcularValorFinal();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("id: ").append(id);
        sb.append(" | plano ").append(nome);
        sb.append(" | aulas: ").append(quantidadeAulas);
        sb.append(" | cliente: ").append(cliente.getNome());

        return sb.toString();
    }

}
