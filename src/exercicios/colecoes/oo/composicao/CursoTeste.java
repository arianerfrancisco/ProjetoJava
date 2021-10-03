package exercicios.colecoes.oo.composicao;

public class CursoTeste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João 1");
        Aluno aluno2 = new Aluno("João 2");
        Aluno aluno3 = new Aluno("João 3");
        Aluno aluno4 = new Aluno("João 4");

        Curso curso1 = new Curso("Matemática");
        Curso curso2 = new Curso("Biologia");
        Curso curso3 = new Curso("História");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);

        aluno1.adicionarCurso(curso3);
        aluno2.adicionarCurso(curso3);
        aluno3.adicionarCurso(curso3);
        aluno4.adicionarCurso(curso3);

        for(Aluno aluno: curso1.alunos){
            System.out.println("Estou matriculado no curso: " + curso1.nome + "...");
            System.out.println("Meu nome é: " + aluno.nome);
            System.out.println(" ");
        }
        System.out.println("________________________________");

        for(Aluno aluno: curso3.alunos){
            System.out.println("Estou matriculado no curso: " + curso3.nome + "...");
            System.out.println("Meu nome é: " + aluno.nome);
            System.out.println(" ");
        }

        System.out.println(aluno1.cursos.get(0).alunos); // pega todos os alunos que
        // estão no primeiro curso do aluno 1

        Curso cursoEncontrado = aluno1.obterCursoPorNome("Matemática");
        if(cursoEncontrado != null) {
            System.out.println(cursoEncontrado.nome);
            System.out.println(cursoEncontrado.alunos);

        }

    }
}
