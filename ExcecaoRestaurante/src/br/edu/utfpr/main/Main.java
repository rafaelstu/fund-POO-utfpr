/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.utfpr.main;

import br.edu.utfpr.dao.RestauranteDao;
import br.edu.utfpr.entidades.Cliente;
import br.edu.utfpr.entidades.Mesa;
import br.edu.utfpr.entidades.Pedido;
import br.edu.utfpr.excecoes.MesaJaExistenteException;
import br.edu.utfpr.excecoes.ValorInvalidoException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tomate
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RestauranteDao restauranteDao = new RestauranteDao();

        Cliente c1 = new Cliente("c1", "23456789");
        Cliente c2 = new Cliente("c2", "98765432");

        Pedido p1 = new Pedido();
        p1.setNome("p1");

        try {
            p1.setValor(900);
        } catch (ValorInvalidoException ex) {
            System.out.println(ex.getMessage());
        }

        Pedido p2 = new Pedido();

        p2.setNome("p2");
        try {
            p2.setValor(0);
        } catch (ValorInvalidoException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            p2.setValor(90);
        } catch (ValorInvalidoException ex) {
            System.out.println(ex.getMessage());
        }

        Mesa m1 = new Mesa(1, c1, p1);
        Mesa m2 = new Mesa(2, c2, p2);

        try {
            restauranteDao.adicionarMesa(m1);
        } catch (MesaJaExistenteException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            restauranteDao.adicionarMesa(m2);
        } catch (MesaJaExistenteException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            restauranteDao.adicionarMesa(m2);
        } catch (MesaJaExistenteException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(restauranteDao.listarMesas());
        System.out.println(restauranteDao.listarPedidos());

        System.out.println(String.format("Faturamento %.2f", restauranteDao.calcularFaturamento()));

        if (restauranteDao.excluirMesa(2)) {
            System.out.println("mesa excluida com sucesso");
        } else {
            System.out.println("falha ao excluir mesa");

        }
        if (restauranteDao.excluirMesa(2)) {
            System.out.println("mesa excluida com sucesso");
        } else {
            System.out.println("falha ao excluir mesa");

        }

    }

}
