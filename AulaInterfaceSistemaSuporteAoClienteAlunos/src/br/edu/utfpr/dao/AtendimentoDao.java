/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.dao;

import br.edu.utfpr.entidades.AtendimentoBase;
import br.edu.utfpr.entidades.AtendimentoPorMeioEletronico;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class AtendimentoDao {

    private List<AtendimentoBase> chamados = new ArrayList<>();

    public void adicionarChamado(AtendimentoBase atendimento) {
        chamados.add(atendimento);
    }

    // Retorna todos os chamados formatados como String
    public String listarTodosChamadosFormatados() {
        StringBuilder sb = new StringBuilder();
        chamados.forEach(c -> sb.append(c).append("\n\n"));
        return sb.toString();
    }

    public List<AtendimentoBase> listarChamadosAbertos() {
        List<AtendimentoBase> abertos = new ArrayList<>();

        for (AtendimentoBase c : chamados) {
            if (c instanceof AtendimentoPorMeioEletronico ab
                    && "Aberto".equals(ab.getStatus())) {
                abertos.add(ab);
            }
        }

        return abertos;
    }

    public List<AtendimentoBase> listarChamadosPorTipo(String tipo) {
        List<AtendimentoBase> porTipo = new ArrayList<>();

        for (AtendimentoBase c : chamados) {
            if (tipo.equals(c.getTipoAtendimento())) {
                porTipo.add(c);
            }
        }

        return porTipo;
    }

}
