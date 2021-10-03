package exercicios.colecoes.oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    final String nome;
    final List<Curso> cursos = new ArrayList<>();

    Aluno(String nome) {
        this.nome = nome;
    }

    void adicionarCurso(Curso curso){
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

    public String toString () { // serve para converter um objeto em formato string
        return nome;
    }

    Curso obterCursoPorNome(String nome) {
        for(Curso curso: this.cursos) {
            if(curso.nome.equalsIgnoreCase(nome)){
                return curso;
            }
        }
        return null;
    }
}
