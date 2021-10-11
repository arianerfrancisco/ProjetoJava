package exercicios.colecoes.oo.heranca.teste;

import exercicios.colecoes.oo.heranca.desafio.Civic;
import exercicios.colecoes.oo.heranca.desafio.Ferrari;

public class Direção {
    public static void main(String[] args) {

        Civic c1 = new Civic();
        c1.acelerar();
        System.out.println(c1);
        c1.acelerar();
        System.out.println(c1);
        c1.acelerar();
        System.out.println(c1);

        Ferrari c2 = new Ferrari(400);
        c2.acelerar();
        System.out.println(c2);
        c2.acelerar();
        System.out.println(c2);
        c2.acelerar();
        System.out.println(c2);

        c1.frear();
        System.out.println(c1);

        c2.frear();
        System.out.println(c2);


    }
}
