/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.dao;

import br.edu.utfpr.entidades.Animal;
import br.edu.utfpr.entidades.Cachorro;
import br.edu.utfpr.entidades.Gato;
import br.edu.utfpr.entidades.Macaco;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class AnimalDao {

    private double precoPorKgCachorro = 30.0; // preço do kg da comida
    private double precoPorKgGato = 10.0; // preço do kg da comida
    private double precoPorKgMacaco = 20.0; // preço do kg da comida
    private List<Animal> animais;

    public AnimalDao() {
        animais = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        if (animais != null) {
            animais.add(animal);
        }
    }

    public StringBuilder gerarRelatorio() {
        StringBuilder sb = new StringBuilder();
        sb.append("===== RELATÓRIO DE ANIMAIS =====\n\n");

        animais.forEach(a -> {

            sb.append(a).append("\n");
            sb.append("Som: ").append(a.emitirSom()).append("\n");
            sb.append("valor do alimento diario: ");
            if (a instanceof Cachorro c) {
                sb.append(String.format("%.2f", a.calcularGastoAlimentoDiario(precoPorKgCachorro))).append("\n");
                sb.append(c.correr()).append("\n");
            } else if (a instanceof Gato g) {
                sb.append(String.format("%.2f", a.calcularGastoAlimentoDiario(precoPorKgGato))).append("\n");
                sb.append(g.correr()).append("\n");
            } else if (a instanceof Macaco m) {
                sb.append(String.format("%.2f", a.calcularGastoAlimentoDiario(precoPorKgMacaco))).append("\n");
                sb.append(m.subir()).append("\n");
            }

            sb.append("\n");
        });

        return sb;
    }

    public double calcularTotalGastoComComida() {
        double totalGastoComComida = 0.0;

        return totalGastoComComida;
    }

}
