package lambdas;

import java.util.function.Predicate;

public class Predicado {
    // Predicate >> recebe um parametro e retorna um boolean
    public static void main(String[] args) {

       Predicate<Produto> isCaro =
               prod -> (prod.preco * (1 - prod.desconto) )>= 750; // lambda

        Produto produto = new Produto("Notebook",3893.89,0.15);
        System.out.println(isCaro.test(produto));

    }
}
