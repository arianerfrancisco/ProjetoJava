package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter2 {
    public static void main(String[] args) {
        // filtrar produtos com desconto acima de 30% e frete gratis
        Produtos p1 = new Produtos("Produto 1", 5.6, 0.3, true);
        Produtos p2 = new Produtos("Produto 2", 5.6, 0.01, false);
        Produtos p3 = new Produtos("Produto 3", 5.6, 0.3, true);
        Produtos p4 = new Produtos("Produto 4", 5.6, 0.03, true);

        List<Produtos> itens = Arrays.asList(p1,p2,p3,p4);
        Predicate<Produtos> desconto = a -> a.desconto >= 0.3;
        Predicate<Produtos> frete = a -> a.freteGratis;
        Function<Produtos, String> selecao =
                a -> " Produtos selecionados:  " + a.nome + " com preço: " + a.preco;
        Consumer<String> println = System.out::println;

        itens.stream()
                .filter(desconto)
                .filter(frete)
                .map(selecao)
                .forEach(println);
    }
}
