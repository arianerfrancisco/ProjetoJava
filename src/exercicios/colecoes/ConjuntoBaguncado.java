package exercicios.colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();
        conjunto.add(1.2); // Como não aceita tipo primitivo>> double => Double (Wrapper)
        conjunto.add("teste"); // String é um objeto, logo é aceito
        conjunto.add(true);
        // não aceita valores repetidos, apenas ignorado o valor add

        System.out.println(conjunto.size());
        System.out.println(conjunto.remove("teste")); // se estiver presente retorna true
        System.out.println(conjunto.size());
        System.out.println(conjunto.contains(1.2)); // booleando para verif conteudo

        Set nums = new HashSet();
        nums.add(1);
        nums.add(8);
        nums.add(10);

        System.out.println(nums);
        System.out.println(conjunto);
        //conjunto.addAll(nums); // união entre os dois conjuntos
        conjunto.retainAll(nums); // intersecção - união entre os pontos em comum
        System.out.println(conjunto); // retornou zero, pois não há itens em comum
        conjunto.clear(); // limpa
    }
}
