package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Aluno 1", 7.8);
        Aluno a2 = new Aluno("Aluno 2", 7.5);
        Aluno a3 = new Aluno("Aluno 3", 5.8);
        Aluno a4 = new Aluno("Aluno 4", 4.8);
        Aluno a5= new Aluno("Aluno 5", 3.8);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);

        Predicate<Aluno> isAprovado = a -> a.nota >= 7;
        Function<Aluno, String> saudacao =
                a -> " Parabéns " + a.nome + "!";
        Consumer<String> print = System.out::print;

        alunos.stream() // CONSTRUCAO
                .filter(isAprovado)
                .map(saudacao)
                .forEach(print); // TERMINAL
    }
}
