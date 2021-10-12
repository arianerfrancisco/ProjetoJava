package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    // Consumer> recebe um unico parametro e não retorna nada
    public static void main(String[] args) {
        Consumer<Produto> imprimirNome =
                p -> System.out.println(p.nome + " !!!");
        Produto p1 = new Produto("Caneta", 56.9, 0.15);
        imprimirNome.accept(p1);

        Produto p2 = new Produto("Caderno", 5.9, 0.5);
        Produto p3 = new Produto("Lápis", 1.2, 0.35);
        Produto p4 = new Produto("Estojo", 3.49, 0.25);
        Produto p5 = new Produto("Lapiseira", 9.8, 0.5);

        List<Produto> produtos = Arrays.asList(p1, p2,p3, p4, p5);
        produtos.forEach(imprimirNome); // com foreach nao precisa utilizar accept

        produtos.forEach(p -> System.out.println(p.preco)); // lambda
        produtos.forEach(System.out::println); // method reference > precisa criar o metodo ToString em produto>
        // aqui vai referenciar ao metodo toString
    }
}
