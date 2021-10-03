package exercicios.fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        // print sem quebra de linha (sem ln)
        System.out.print("Bom"); // como não foi colocado println não irá pular linha
        System.out.print("dia");
        System.out.print("dia!\n"); //\n quebra de linha

        // print com quebra de linha (ln)
        System.out.println("teste");

        // print formatado( com f)
        System.out.printf("Mega Sena: %d  %d %d %d %d %d %n",1,2,3,4,5,6);
        System.out.printf("Salário: %.1f%n",1234.5678); // irá arredondar para 6

        // SCANNER _________________________________________________________
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("\n\nO nome digitado foi: "  + nome);

        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();
        System.out.printf("%s tem %d anos ", nome, idade);
        entrada.close();
    }
}
