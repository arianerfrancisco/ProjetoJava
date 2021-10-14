package Stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Lu", "Gui", "Ana", "Luca");

        System.out.println("Usando o laço For...");
        for (int i = 0; i < aprovados.size(); i++) {
            System.out.println(aprovados.get(i));
        }

        System.out.println(" \nUsando o ForEach...");
        for(String nome: aprovados) {
            System.out.println(nome);
        }

        // iterator> interface do java
        System.out.println(" \nUsando Iterator...");
        Iterator<String> it = aprovados.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        // stream > interface do java
        System.out.println(" \nUsando Stream...");
        Stream<String> st = aprovados.stream();
        st.forEach(System.out::println); // laço interno
    }
}
