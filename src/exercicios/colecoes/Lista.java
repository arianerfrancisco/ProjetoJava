package exercicios.colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> lista= new ArrayList<>();
        Usuario u1 = new Usuario("Ana");
        lista.add(u1);
        // ou
        lista.add(new Usuario("Joaquim"));
        lista.add(new Usuario("Joao"));
        lista.add(new Usuario("José"));
        System.out.println(lista.size());

        for(Usuario u : lista) {
            System.out.println(u); // agora trará a formatação do toString
        }

        for(Usuario u : lista) {
            System.out.println(u.nome);
        }

        // obtendo dados pelo id

        System.out.println(lista.get(1).nome);

        // removendo itens
        System.out.println(">>>" + lista.remove(1));  // retorna o conteudo removido
        System.out.println(lista.remove(new Usuario("José"))); // booleano- true deu certo
        System.out.println("Contêm João: " + lista.contains(new Usuario("Joao")));
        // essas operações só foram possiveis devido ao metodo -- Generate equals() and hashCode()  colocado
        // na classe, que torna possivel comparar  new Usuario("José")
        // dai comparará pelo endereço de memória
    }
}
