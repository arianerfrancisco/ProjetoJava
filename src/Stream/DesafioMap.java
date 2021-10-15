package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
    //  1 - Numero para string binaria
    //  2- Ineverter a string ..."110''-> "011"
    //   3- Converter novamente para inteiro
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
        // para reverter nao existe uma funcao pronta

        UnaryOperator<String> inverter =
                s -> new StringBuilder(s).reverse().toString();

        Function<String, Integer> binarioParaInt =
                s -> Integer.parseInt(s, 2); // 2 identifica o recebimento de um binario

        nums.stream() // OPERAÇÃO DE CONSTRUÇÃO
                .map(Integer::toBinaryString) // para conversao ja existe um metodo pronto -  OPERAÇÃO INTERMEDIARIA
                .map(inverter) // -  OPERAÇÃO INTERMEDIARIA
                .map(binarioParaInt) // -  OPERAÇÃO INTERMEDIARIA
                .forEach( System.out::println); // OPERACAO DE TERMINAÇÃO

    }
}
