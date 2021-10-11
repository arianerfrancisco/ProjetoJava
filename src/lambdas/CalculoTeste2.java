package lambdas;

public class CalculoTeste2 {
    public static void main(String[] args) {
        Calculo calc = (x,y) -> {return x + y; };
        // apesar de nao ter invocado o nome do metodo, irá utilizar por padrão o unico metodo definido no escopo
        // da interface --
        // NOTA: quando utilizamos o par de chaves> {return x + y; } é obrigatorio o uso da palavra return
        System.out.println(calc.executar(2,3));

        calc= (x,y) ->  x * y;
        System.out.println(calc.executar(2, 3));
    }
}
