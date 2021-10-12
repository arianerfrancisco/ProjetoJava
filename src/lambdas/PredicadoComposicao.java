package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {
    // predicato: recebe um parametro e retorna expressao booleana
    public static void main(String[] args) {
        Predicate<Integer>  isPar = num -> num % 2 ==0;
        Predicate<Integer>  isTresDigitos =
                num -> num >=100 && num <= 999;

        System.out.println(isPar.and(isTresDigitos).test(22)); // precisa atender as duas condicoes para sair true
        System.out.println(isPar.or(isTresDigitos).test(45)); // precisa atender uma das condicoes

    }
}
