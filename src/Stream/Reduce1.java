package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class Reduce1 {
    // ASSIM COMO FOREACH, REDUCE É UMA OPERAÇÃO TERMINAL, POIS APÓS ELA NÃO TEM COMO DESENCADEAR MAIS FUNÇÕES
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6,7,8,9);
        BinaryOperator<Integer> soma =  (ac, n) -> ac + n;

        Integer total1 = nums.stream().reduce(soma).get();
        System.out.println(total1);

        Integer total2 = nums.parallelStream().reduce(100,soma); // quando não sabemos o resultado, dai o uso do Integer
        // aqui nao precisa de get, pois existe um valor inicial
        System.out.println(total2); // como é uma chamada parallelStream, todas as operacoes executam paralelamento
        // com valor inicial 100, dai o resultado da operacao 621. para que isso não ocorra utilizamos stream ao inves de paralelo

        Integer total3 = nums.stream().reduce(100,soma);
        System.out.println(total3);

        // RESULTADO FOI UM OPCTIONAL<INTEGER>.... QUANDO NÃO PASSAMOS UM VALOR INICIAL PRECISAMOS USAR GER
        // MAS NESTE CASO TEMOS UM VALOR INICIAL 100, DESSA FORMA NAO PRECISA
        nums.stream()
                .filter(n -> n > 5)
                .reduce(soma)
                .ifPresent(System.out::print);
    }
}
