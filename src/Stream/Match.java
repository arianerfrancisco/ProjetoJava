package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Aluno 1", 7.8);
        Aluno a2 = new Aluno("Aluno 2", 7.5);
        Aluno a3 = new Aluno("Aluno 3", 5.8);
        Aluno a4 = new Aluno("Aluno 4", 4.8);
        Aluno a5= new Aluno("Aluno 5", 3.8);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);
        Predicate<Aluno> aprovado = a -> a.nota >=7; // retorno boolean
        Predicate<Aluno> reprovado =aprovado.negate();
        // match operacao terminadora

        System.out.println(alunos.stream().allMatch(aprovado)); // allMatch: todos os alunos foram aprovados?
        // conceito de paradigmas funcionais incorporados no java 8
        System.out.println(alunos.stream().anyMatch(aprovado)); // aanyMatch: alguem foi aprovado?
        System.out.println(alunos.stream().noneMatch(reprovado)); // noneMatch: nenhum foi aprovado?


    }
}
