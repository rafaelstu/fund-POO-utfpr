/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.utfpr.main;

import br.edu.utfpr.empresa.Empresa;
import br.edu.utfpr.empresa.EmpresaCumulativa;
import br.edu.utfpr.empresa.EmpresaIsenta;
import br.edu.utfpr.empresa.EmpresaNaoCumulativa;

/**
 *
 * @author tomate
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empresa eI = new EmpresaIsenta("isenta", "12903123901", 1111110);
        Empresa eC = new EmpresaCumulativa("cumulativa", "12893172", 234554);
        Empresa eNC = new EmpresaNaoCumulativa("nao cumulativa", "625433232", 352345);

        System.out.println(eI);

        System.out.println(eC);

        System.out.println(eNC);
    }

}
