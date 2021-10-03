package exercicios.controle;

public class For3 {
    public static void main(String[] args) {
        int i = 0; // declarando fora do escopo for, a variavel continua acessivel fora.
        for (; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("Saiu do for....");
        System.out.println(i); // vide comentario linha 5
    }
}
