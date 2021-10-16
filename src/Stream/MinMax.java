package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class MinMax {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Aluno 1", 7.8);
        Aluno a2 = new Aluno("Aluno 2", 7.5);
        Aluno a3 = new Aluno("Aluno 3", 5.8);
        Aluno a4 = new Aluno("Aluno 4", 4.8);
        Aluno a5= new Aluno("Aluno 5", 3.8);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);

        // UTILIZANDO INTERFACE COMPARATOR
        Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {
            if(aluno1.nota > aluno2.nota) return 1;
            if(aluno1.nota < aluno2.nota) return -1;
            return 0;
        };

        Comparator<Aluno> piorNota = (aluno1, aluno2) -> {
            if(aluno1.nota > aluno2.nota) return -1;
            if(aluno1.nota < aluno2.nota) return 1;
            return 0;
        };
        System.out.println(alunos.stream().max(melhorNota).get());
        System.out.println(alunos.stream().min(melhorNota).get()); // PODERIAMOS CRIAR UM COMPARATOR COM  A PIOR NOTA - vide linha 33
        System.out.println(alunos.stream().max(piorNota).get());
    }
}
