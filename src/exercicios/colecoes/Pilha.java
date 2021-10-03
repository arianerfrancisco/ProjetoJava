package exercicios.colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        // Conceito FIFO: o último que entra é o primeiro que sai
        Deque<String> livros = new ArrayDeque<>();
        livros.add("O pequeno principe"); // retorna true ou false caso adicione
        livros.push("A casa de cera"); // sem retorno ao adicionar, mas dá erro de Exception caso
        // não seja possível por restriçoes de capacidade
        livros.push("O hobbit");

        System.out.println(livros.peek()); // o resultado será o ultimo adicionado
        System.out.println(livros.poll()); // remove o ultimo adicionado // em caso de erro retorna null
        // no caso de remove não sendo possivel a exceção retorn exception
        System.out.println(livros.pop()); // também remove  e também trata com exceção caso não seja
        // possivel excluir

        for( String livro: livros) {
            System.out.println(livro); // ele percorre do topo até embaixo
        }

    }

}
