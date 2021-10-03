package exercicios.fundamentos;
import java.util.Scanner;

public class TipoStringEquals {
    public static void main(String[] args) {
        // ao comparar strigs utilizar equals e não ==

        System.out.println("2" == "2");

        String s1 = new String("2");
        System.out.println("2" == s1);
        System.out.println("2".equals(s1)); // equals garante que comparará apenas o conteúdo

        Scanner entrada = new Scanner(System.in);

        String s2 = entrada.next();
        System.out.println("2" == s2.trim()); // trim() > tira os espaços em branco
        System.out.println("2".equals(s2.trim()));

        entrada.close();
    }
}
