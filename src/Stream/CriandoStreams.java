package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {
        // CONSUMER - RECEBE UM PARAMETRO E NAO RETORNA NADA
       Consumer<String> print = System.out::print;

       // CRIANDO UM STREAM ATRAVÉS DO MÉTODO ESTATICO STREAM.OF
       Stream<String>  langs = Stream.of(" Java ", " Python ", " PHP\n"); // criando stream
        langs.forEach(print);

        //CRIANDO STREAM A PARTIR DE UM ARRAY
        String[] mainsLangs = {" Python ", " Lisp "};
        Stream.of(mainsLangs).forEach(print);

        // CRIANDO A PARTIR DA CLASSE ARRAY
        Arrays.stream(mainsLangs).forEach(print);
        Arrays.stream(mainsLangs,1,2).forEach(print); // pegando o elemento do indice 1 ao 2, sem incluir o 2

        // CRIANDO A PARTIR DAS COLLECTIONS
        List<String> outrasLangs = Arrays.asList("C", "C++", "C#");
        outrasLangs.stream().forEach(print);
        outrasLangs.parallelStream().forEach(print);

        // CRIANDO A PARTIR DO METODO GENERATE
        Stream.generate(() -> "a").forEach(print); // SUPPLIER - RETORNA SEM TER SIDO PASSADO PARAMETROS
        // () -> "a" >>> LAMBDA
    }
}
