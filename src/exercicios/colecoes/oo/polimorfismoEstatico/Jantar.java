package exercicios.colecoes.oo.polimorfismoEstatico;

public class Jantar {
    public static void main(String[] args) {
        // polimorfismo estatico = sobrecarga de metodos, aonde teremos o mesmo nome para o mesmo comportamento porem com parametro diferente
        Pessoa convidado = new Pessoa(99.65);

        Arroz ingrediente1 = new Arroz(0.250);
        Feijão ingrediente2 = new Feijão(0.35);

        System.out.println(convidado.getPeso());
        convidado.comer(ingrediente1);
        convidado.comer(ingrediente2);

        System.out.println(convidado.getPeso());

        Sorvete sobremesa = new Sorvete(54);
        convidado.comer(sobremesa);
        System.out.println(convidado.getPeso());


    }
}
