package exercicios.colecoes.oo.abstrato;

public class TesteAbstrato {
    public static void main(String[] args) {
        Animal a = new Cachorro();
        //System.out.println(a.mover());
        System.out.println(a.respirar());

        Mamifero b = new Cachorro();
        System.out.println(b.mover());
        System.out.println(b.respirar());
        System.out.println(b.mamar()); // a partir de mamifero tem o metodo mamar

    }
}
