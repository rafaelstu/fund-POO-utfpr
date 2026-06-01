/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.main;

import br.edu.utfpr.dao.AtendimentoDao;
import br.edu.utfpr.entidades.AtendimentoBase;
import br.edu.utfpr.entidades.AtendimentoChat;
import br.edu.utfpr.entidades.AtendimentoEmail;
import br.edu.utfpr.entidades.AtendimentoPorMeioEletronico;
import br.edu.utfpr.entidades.AtendimentoPresencial;
import br.edu.utfpr.entidades.AtendimentoTelefone;
import br.edu.utfpr.entidades.Cliente;
import java.util.List;

/**
 *
 * @author Dell
 */
public class UsandoAtendimento {

    public static void main(String[] args) {
        AtendimentoDao atendimentoDao = new AtendimentoDao();

        Cliente cliente1 = new Cliente("Maria Silva", "maria@email.com", "11987654321", true);
        Cliente cliente2 = new Cliente("João Santos", "joao@email.com", "11912345678", false);
        Cliente cliente3 = new Cliente("Ana Pereira", "ana@email.com", "11998765432", true);
        Cliente cliente4 = new Cliente("Equipe TI", "ti@empresa.com", "1190000000", true);

        AtendimentoBase email = new AtendimentoEmail(5, true, "Ana", cliente1);
        AtendimentoBase chat = new AtendimentoChat("WhatsApp", 10, "Maria", cliente2);
        AtendimentoBase telefone = new AtendimentoTelefone(20, true, "Carol", cliente3);
        AtendimentoBase presencial = new AtendimentoPresencial("TI", "Flavia", cliente4);

        if (email instanceof AtendimentoPorMeioEletronico e) {
            e.abrirChamado("chamado pelo email muito louco shaolinmatadordeporco@gmail.com");
        }

        if (chat instanceof AtendimentoPorMeioEletronico c) {
            c.abrirChamado("chat chamado 012356789");
        }

        atendimentoDao.adicionarChamado(email);
        atendimentoDao.adicionarChamado(chat);
        atendimentoDao.adicionarChamado(telefone);
        atendimentoDao.adicionarChamado(presencial);

        System.out.println("\n============Todos os chamados==============================\n");
        System.out.println(atendimentoDao.listarTodosChamadosFormatados());

        System.out.println("\n============Chamados abertos==============================\n");
        System.out.println(atendimentoDao.listarChamadosAbertos());

        if (chat instanceof AtendimentoPorMeioEletronico c) {
            c.fecharChamado();
        }

        System.out.println("\n" + atendimentoDao.listarChamadosAbertos());

        System.out.println("\n============Todos os chamados==============================\n");
        System.out.println(atendimentoDao.listarTodosChamadosFormatados());

        System.out.println("\n============Chamados por tipo==============================\n");
        System.out.println(atendimentoDao.listarChamadosPorTipo("Chat"));
    }
}
