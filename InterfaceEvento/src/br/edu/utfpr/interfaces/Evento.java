/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.utfpr.interfaces;

import br.edu.utfpr.entidades.Participante;

/**
 *
 * @author tomate
 */
public interface Evento {

    boolean adicionarParticipante(Participante participante);

    boolean verificarLotacao();

    boolean verificarParticipante(Participante participante);
}
