package exercicios.controle;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a sua média: "); // println> pula a linha
        double media = entrada.nextDouble();

        if(media <= 10 && media >= 7.0) {
            System.out.println("Aprovado");
            System.out.println("Parabéns");
        }

        if(media < 7 && media >= 4.5) {
            System.out.println("Recuperação. Você ainda tem mais uma chance!");
        }
        // atribuição variavel
        boolean criterioReprovacaoAtingido= media < 4.5 && media >= 0;
        if(criterioReprovacaoAtingido) {
            System.out.println("Reprovado!");
        }


        entrada.close();
    }
}
