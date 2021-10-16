package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Aluno 1", 7.8);
        Aluno a2 = new Aluno("Aluno 2", 7.5);
        Aluno a3 = new Aluno("Aluno 3", 5.8);
        Aluno a4 = new Aluno("Aluno 4", 4.8);
        Aluno a5= new Aluno("Aluno 5", 3.8);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);
        Predicate<Aluno> aprovado = a -> a.nota >=7; // retorno booleano
        Function<Aluno, Double> apenasNota = a -> a.nota;
        BinaryOperator<Double> somatorio = (a, b) -> a + b; // RESULTAD OPCTIONAL<INTEGER>

        alunos.parallelStream()// como não ter valor inicial, não irá afetar o resultado
                .filter(aprovado)
                .map(apenasNota)
                .reduce(somatorio)
                .ifPresent(System.out::println); // ifPresente retornar o OPCTIONAL<INTEGER>
    }
}
