package br.edu.utfpr.usandoProduto;

import br.edu.utfpr.produto.Eletronico;
import br.edu.utfpr.produto.Livro;

public class UsandoProduto {

    public static void main(String[] args) {

        Livro livro = new Livro("Dom Casmurro", 29.90, "Machado de Assis");
        System.out.println(livro);
        System.out.println(String.format("valor do desconto: %.2f", livro.calcularDesconto()));
        System.out.println(String.format("valor total: %.2f", livro.calcularValorTotal(2)));

        Eletronico eletronico = new Eletronico("Smartphone", 1999.99, "Samsung");

        System.out.println(eletronico);
        System.out.println(String.format("valor do desconto: %.2f", eletronico.calcularDesconto()));
        System.out.println(String.format("valor total: %.2f", eletronico.calcularValorTotal(2)));

    }

}
