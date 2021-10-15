package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
    public static void main(String[] args) {
        // criar dois filtros
        // depois usar algum metodo com map

        Aluno a1 = new Aluno("Aluno 1", 7.8, 12);
        Aluno a2 = new Aluno("Aluno 2", 7.5, 13);
        Aluno a3 = new Aluno("Aluno 3", 5.8, 14);
        Aluno a4 = new Aluno("Aluno 4", 4.8, 15);
        Aluno a5= new Aluno("Aluno 5", 3.8, 16);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);

        Predicate<Aluno> isAdolescente = a -> a.idade >= 13;
        Predicate<Aluno> isReprovado = a -> a.nota <= 6;
        Function<Aluno, String> aviso =
                a -> " Eiii...  " + a.nome + " Você conseguirá passar se estudar um pouco mais!";
        Consumer<String> println = System.out::println;

        alunos.stream()
                .filter(isAdolescente)
                .filter(isReprovado)
                .map(aviso)
                .forEach(println);
    }
}
