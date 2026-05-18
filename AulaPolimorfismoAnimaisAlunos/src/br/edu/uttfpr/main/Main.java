/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uttfpr.main;

import br.edu.utfpr.dao.AnimalDao;
import br.edu.utfpr.entidades.Animal;
import br.edu.utfpr.entidades.Cachorro;
import br.edu.utfpr.entidades.Gato;
import br.edu.utfpr.entidades.Macaco;

/**
 *
 * @author andre
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Animal c = new Cachorro("luke", 6);
        Animal g = new Gato("barto", 2);
        Animal m = new Macaco("josefino", 8);

        AnimalDao dao = new AnimalDao();

        dao.addAnimal(c);
        dao.addAnimal(g);
        dao.addAnimal(m);

        System.out.println(dao.gerarRelatorio());

//        System.out.println(c);
//        System.out.println(g);
//        System.out.println(m);
//
//        System.out.println(c.emitirSom());
//        System.out.println(g.emitirSom());
//        System.out.println(m.emitirSom());
//
//
//
//        if (c instanceof Cachorro cao) {
//            System.out.println(cao.correr());
//        }
//        if (g instanceof Gato gato) {
//            System.out.println(gato.correr());
//        }
//        if (m instanceof Macaco mamaco) {
//            System.out.println(mamaco.subir());
//        }
    }

}
