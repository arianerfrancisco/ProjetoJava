package exercicios.colecoes;


import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
        TreeSet<String> listaAprovados = new TreeSet<>(); // TreeSet garante a ordem de inserção
        listaAprovados.add("Ariane");
        listaAprovados.add("Rocha");
        listaAprovados.add("Francisco");

        System.out.println(listaAprovados);

        for(String candidato: listaAprovados ) {
            System.out.println(candidato);
        }

    }
}
