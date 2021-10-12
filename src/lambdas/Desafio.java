package lambdas;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;


// calcular o desconto
//>=2500 : 8,5%  - abaixo isento
// Frete>3000:100 = abaixo 50
// Arredondar duas casas decimais
// Formatar com r$
public class Desafio {
    public static void main(String[] args) {

        Function<Produto, Double> precoFinal = produto -> produto.preco * (1 - produto.desconto);
        UnaryOperator<Double> imposto = preco -> preco >= 2500 ? preco * 1.085 : preco;
        UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
        UnaryOperator<Double> arredondar = preco -> Double.parseDouble(String.format(Locale.ENGLISH, "%.2f", preco));
        Function<Double, String> formatar= preco -> ("R$" + preco).replace(".",",");

        Produto p = new Produto("Ipad", 3235.89,0.13);

        String preco = precoFinal
                .andThen(imposto)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p);
        System.out.println("O preço final é: " + preco);

    }

}
