package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;
        List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda");
        marcas.stream().map(m -> m.toUpperCase()).forEach(print);

       // UnaryOperator<String> maiuscula = n -> n.toUpperCase(); -- > foi feita em outra classe
       // UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
      //  UnaryOperator<String> grito = n -> n + "!!!";

        System.out.println(" \n\n Usando Composição em um conjunto de dados");
        marcas.stream()
                .map(Utilitarios.maiuscula) // reaproveitando o metodo de outra interface
                .map(Utilitarios.primeiraLetra) // reaproveitando o metodo de outra interface
                .map(Utilitarios::grito) // Method Reference
                .forEach(print);
    }
}
