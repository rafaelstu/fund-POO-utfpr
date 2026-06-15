/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.dao;

import br.edu.utfpr.entidades.Mesa;
import br.edu.utfpr.entidades.Pedido;
import br.edu.utfpr.excecoes.MesaJaExistenteException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tomate
 */
public class RestauranteDao {

    private List<Mesa> mesas = new ArrayList<>();
    private List<Pedido> pedidos = new ArrayList<>();

    public void adicionarMesa(Mesa mesa) throws MesaJaExistenteException {

        for (Mesa m : mesas) {
            if (m.getNumero() == mesa.getNumero()) {
                throw new MesaJaExistenteException("mesa " + mesa.getNumero() + " já existe");
            }
        };

        mesas.add(mesa);
        pedidos.add(mesa.getPedido());
    }

    public String listarPedidos() {
        StringBuilder sb = new StringBuilder();

        sb.append("PEDIDOS:\n");

        for (Pedido p : pedidos) {
            sb.append(p).append("\n");
        }

        return sb.toString();
    }

    public String listarMesas() {
        StringBuilder sb = new StringBuilder();

        sb.append("MESAS:\n");

        for (Mesa m : mesas) {
            sb.append(m).append("\n");
        }

        return sb.toString();
    }

    public boolean excluirMesa(int numeroMesa) {

        return mesas.removeIf(m -> m.getNumero() == numeroMesa);

    }

    public double calcularFaturamento() {
        double total = 0;

        for (Pedido p : pedidos) {
            total += p.getValor();
        }

        return total;
    }
}
