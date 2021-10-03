package exercicios.controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String texto = "";

        do { // pelo menos 1 vez essa sentença será executada
            System.out.println("Você precisa falar "
                    + "\nas palavras mágicas...");
            System.out.print("Quer sair? ");
            texto = entrada.nextLine();
        } while(!texto.equalsIgnoreCase("por favor")); // quando o usuário digitar sair, o código finaliza aqui


        System.out.println("Obrigado!");
        entrada.close();
    }
}
