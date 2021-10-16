package Stream;

import java.util.Objects;

public class Aluno {
    final String nome;
    final double nota;
    final int idade;

    public Aluno(String nome, double nota, int idade) {
        this.nome = nome;
        this.nota = nota;
        this.idade = idade;
    }

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
        this.idade = 0;
    }


    @Override
    public String toString() {
        return nome + " tem nota: " + nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Double.compare(aluno.nota, nota) == 0 && idade == aluno.idade && Objects.equals(nome, aluno.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, nota, idade);
    }
}
