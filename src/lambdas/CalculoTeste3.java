package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {
        // para este caso não precisariamos criar uma interface calculo, apenas utilizar essa do java
        BinaryOperator <Double> calc = (x,y) -> {return x + y; };
        System.out.println(calc.apply(2.0,3.0));
        calc = (x,y) -> {return x * y; };
        System.out.println(calc.apply(2.0,3.0));

         // BinaryOperator <PODE SER LISTAS, BOOLEAN, STRINGS......>
        BinaryOperator <Integer> calc2 = (x,y) -> {return x + y; };
        System.out.println(calc2.apply(4,6));
        calc2 = (x,y) -> {return x * y; };
        System.out.println(calc2.apply(4,6));
    }
}
