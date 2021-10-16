package Stream;

import java.util.Arrays;
import java.util.List;

public class OutrosMetodos {
    public static void main(String[] args) {
        // as operacoes abordadas nesta classe, sõa do tipo intermediarias
        Aluno a1 = new Aluno("Aluno 1", 7.8);
        Aluno a2 = new Aluno("Aluno 1", 7.8);
        Aluno a3 = new Aluno("Aluno 3", 5.8);
        Aluno a4 = new Aluno("Aluno 3", 5.8);
        Aluno a5= new Aluno("Aluno 5", 3.8);
        Aluno a6 = new Aluno("Aluno 6", 7.8);
        Aluno a7 = new Aluno("Aluno 7", 6.5);
        Aluno a8 = new Aluno("Aluno 8", 2.8);
        Aluno a9 = new Aluno("Aluno 9", 4.8);
        Aluno a10= new Aluno("Aluno 10", 8.8);

        List<Aluno> alunos =
                Arrays.asList(a1, a2, a3, a4, a5, a6,a7,a8,a9, a10);

        System.out.println("disctinct...."); // para que o algoritmo nao compare com o endereço de memoria
        // na classe aluno geramos o metodo eqyuals e hashcode- vide a partir das linhas 29
        alunos.stream().distinct().forEach(System.out::println);// RETIRAR AS DUPLICACOES

        System.out.println("\n");
        System.out.println("\n Skip/Limite"); // esse metodo pula elementos a partir da definição passada
        alunos.stream()
                .distinct()
                .skip(2) // vai considerar apenas a partir do segundo elemento
                .limit(2) // vai limitar a dois elementos
                .forEach(System.out::println);

        System.out.println("\n");
        System.out.println("\n takeWhile"); // esse metodo pula elementos a partir da definição passada
        alunos.stream()
                .distinct()
                .takeWhile(a-> a.nota >= 7) // quando chegar em uma nota acima de 7, o algoritmo encerra a execucao
                .forEach(System.out::println);
    }
}
