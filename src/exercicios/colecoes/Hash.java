package exercicios.colecoes;




import java.util.HashSet;

public class Hash {

    public static void main(String[] args) {

        var usuarios = new HashSet<>();
        usuarios.add(new Usuario("Teste1"));
        usuarios.add(new Usuario("Teste2"));
        usuarios.add(new Usuario("Teste3"));
        System.out.println(usuarios);

        boolean resultado = usuarios.contains(new Usuario("Guilherme"));
        System.out.println(resultado); // não tem o elemento, logo false

    }
}
