package exercicios.colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // adicionando itens numa fila
        fila.add("Ana"); // gera um erro casa adicionamos um item numa fila que já não tem espaço
        fila.offer("Bia"); // se por restrições de tamanho ele sim/não consiga inserir retorna true/false
        fila.offer("Carlos");
        fila.offer("Daniel");
        fila.offer("Rafael");

        // pegando elementos da fila, os dois se comportam diferentemente apenas quando não há itens
        // na fila. No caso do peek retorna erro e element retorna Element exception

        System.out.println(fila.peek()); // retorna o primeiro item adicionado. Se estiver vazio retorna null
        System.out.println(fila.element());
        // fila.clear(); // LIMPA A FILA
        // fila.size(); // TRAZ O TAMANHO DA FILA
        System.out.println(fila.isEmpty()); // PARA VERIFICAR SE A FILA ESTÁ VAZIA

        // retornar o primeiro item da fila já removendo
        System.out.println(fila.poll()); // ele retorna o nome do item removido
        System.out.println(fila.remove()); // a diferença é que este quando a lista estiver vazia
        // retorna um erro de exceção, já o poll retorna null

    }
}
