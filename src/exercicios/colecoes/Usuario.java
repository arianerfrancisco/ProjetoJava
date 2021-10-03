package exercicios.colecoes;

import java.util.Objects;

public class Usuario {
    String nome;

    Usuario(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return "Meu nome é " + this.nome + ".";
    }

    @Override //Generate equals() and hashCode() for a class-  From the Code menu, click Generate Alt+Insert.
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nome, usuario.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
