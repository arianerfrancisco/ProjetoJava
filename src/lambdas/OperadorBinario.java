package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
    public static void main(String[] args) {
        BinaryOperator<Double> media =
               ( n1,  n2) -> (n1 + n2)/2;

        System.out.println(media.apply(9.8,7.7));
        // numa operacao binaria oferecemos dois valores e ele retorna um double neste caso
        // caso quisessemos dar o retorno da aprovacao, não é possivel somente com ele
// BiFunction - dois tipos para entrada e um para saida
        BiFunction < Double, Double, String> resultado = (n1, n2) -> {
           double NotaFinal  = (n1 + n2)/2 ;
           return NotaFinal >= 7 ? "Aprovado": "Reprovado";
        };
        System.out.println(resultado.apply(8.4,4.7));

        Function<Double, String> conceito =
                m -> m>=7 ? "Aprovado":"Reprovado";
        System.out.println(conceito.apply(8.1));
        // composicao
        System.out.println(media.andThen(conceito).apply(9.9,4.9));
    }
}
