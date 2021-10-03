package exercicios.colecoes;

import java.security.KeyStore;
import java.util.HashMap;

public class Mapa<I extends Number, S> {
    public static void main(String[] args) {

        var usuarios = new HashMap<>();
        usuarios.put(1, "Roberto");
        usuarios.put(20, "Ricardo");
        usuarios.put(3, "Rafaela");
        usuarios.put(4, "Rebeca");
        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(20));
        System.out.println(usuarios.containsValue("Rebeca"));

        System.out.println(usuarios.get(4));
        System.out.println(usuarios.remove(1));
        System.out.println(usuarios.remove(4, "Gui"));

        for(Object chave: usuarios.keySet()) {
            System.out.println(chave);
        }

        for(Object valor: usuarios.values()) {
            System.out.println(valor);
        }




    }
}
