package br.edu.utfpr.main;

import br.edu.utfpr.entidade.Veiculo;

public class UsandoVeiculo {

    public static void main(String[] args) {
        Veiculo ka = new Veiculo();
        ka.setMarca("ford");
        ka.setModelo("ka");
        ka.setVelocidadeMaxima(180);

        System.out.println(ka);
        System.out.println("\n");
        Veiculo corolla = new Veiculo("toyota", "corolla", 260);
        System.out.println(corolla);

        int incremento = 11;
        System.out.println("\nAcelerando corolla...");
        while (corolla.acelerar(incremento)) {
            System.out.println("velocidade atual: " + corolla.getVelocidade());
        }
        System.out.println("velocidade maxima atingida: " + corolla.getVelocidade());
        System.out.println("bagualudo ta rapido demais");

        int decremento = 10;
        while (corolla.desacelerar(decremento)) {
            System.out.println("velocidade atual: " + corolla.getVelocidade());
        }

        System.out.println("carro parado: " + corolla.getVelocidade());

    }

}
