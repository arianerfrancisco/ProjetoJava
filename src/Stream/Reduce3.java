package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Aluno 1", 7.8);
        Aluno a2 = new Aluno("Aluno 2", 7.5);
        Aluno a3 = new Aluno("Aluno 3", 5.8);
        Aluno a4 = new Aluno("Aluno 4", 4.8);
        Aluno a5= new Aluno("Aluno 5", 3.8);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);

        Predicate<Aluno> aprovado = a -> a.nota >=7;
        Function<Aluno, Double> apenasNota = a -> a.nota;
        BiFunction<Media, Double, Media> calcularMedia= // ACUMULADOR= MEDIA, VALOR DOS ELEMENTOS= DOUBLE E O RESULTADO=MEDIA
                (media, nota) -> media.adicionar(nota);
        BinaryOperator<Media> combinarMedia =
                (m1,m2) -> Media.combinar(m1,m2);

       Media media =  alunos.stream()
                .filter(aprovado)
                .map(apenasNota) // até aqui é uma stream com dados do tipo double>> vide linha 20
                .reduce(new Media(),calcularMedia, combinarMedia);

        System.out.println(" A média dos aprovados da turma é: " + media.getValor());

    }
}
