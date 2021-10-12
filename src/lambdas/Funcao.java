package lambdas;

import java.util.function.Function;

public class Funcao {
    // interface que recebe um tipo de parametro e saida definido pelo programador
    public static void main(String[] args) {
        Function<Integer, String> parOuImpar = // entrada inteiro e saida uma string
                numero -> numero % 2 == 0 ? "Par": "Impar";

        Function<String, String> oResultadoE = // entrada inteiro e saida uma string
                valor -> " O resultado é: " + valor;

        Function<String, String> empolgado =
                valor -> valor + " !!!!";

        String resultadoFinal = parOuImpar
                        .andThen(oResultadoE)
                        .andThen(empolgado)
                        .apply(32);
        // foi possivel concaternar essas funcoes, pois suas saidas estavam definidas como String

        System.out.println(resultadoFinal);
        System.out.println(parOuImpar.apply(33));

    }
}
