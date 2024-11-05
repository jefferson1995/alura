package com.jefferson.demo.playground.reflexao;

import com.jefferson.demo.playground.controller.Controle;
import com.jefferson.demo.playground.controller.SubControle;

public class TesteInstanciaObjeto {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        // url -> /controle/lista

        Class<Controle> controleClasse1 = Controle.class;

        Controle controle = new SubControle();

        Class<? extends Controle> controleClasse2 = controle.getClass();

        Class<?> controleClasse3 = Class.forName("com.jefferson.demo.playground.controller.Controle");

        Object objetoControle = controleClasse1.newInstance();

        System.out.println(objetoControle instanceof Controle);
        System.out.println(objetoControle instanceof SubControle);

    }
}
