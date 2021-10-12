package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
    public static void main(String[] args) {

    // essa interface nao recebe parametro, mas fornece um retorno
    Supplier<List<String>> umaLista = () -> Arrays.asList("Ana", "lia", "Gui");
    // em lambda é obrigatorio o uso do () quando nenhum parametro é passado ou quando é mais de um parametro
        // podemos suprimir o parametro da lambda quando apenas um parametro sera passado
    System.out.println(umaLista.get());

}
}
