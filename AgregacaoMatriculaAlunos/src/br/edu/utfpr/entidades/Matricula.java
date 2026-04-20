/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.entidades;

import br.edu.utfpr.enums.Situacao;

/**
 *
 * @author Andreia
 */
public class Matricula {

    private Curso curso;
    private Aluno aluno;
    private Disciplina disciplina;
    private int anoIngresso;
    private int serie;
    private Historico historico;

    public Matricula(Curso curso, Aluno aluno, Disciplina disciplina, int anoIngresso, int serie, String observacao) {
        this.curso = curso;
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.anoIngresso = anoIngresso;
        this.serie = serie;
        this.historico = new Historico(observacao, aluno, Situacao.REGULAR);
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public Historico getHistorico() {
        return historico;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("curso: ").append(curso);
        sb.append("\naluno: ").append(aluno);
        sb.append("\ndisciplina: ").append(disciplina);
        sb.append("\nanoIngresso: ").append(anoIngresso);
        sb.append("\nserie: ").append(serie);
        sb.append("\nhistorico: ").append(historico);
        return sb.toString();
    }

}
