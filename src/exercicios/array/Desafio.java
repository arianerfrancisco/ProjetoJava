package exercicios.array;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        // Desafio: Calcule a média das notas informadas pelo usuário. Regra: Insira no array pelo For e calcule a média pelo ForEach
        var entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de notas:  ");
        int tamanho = entrada.nextInt();
        double[] notas = new double[tamanho];

        for (int contador = 1; contador <= tamanho; contador++) {
            System.out.printf("Digite a  %dº nota: ", contador);
            notas[contador-1] = entrada.nextDouble();
            // no terminal precisa separar os decimais com vírgula
        }
        double media = 0;
        for(double nota: notas) {
            media += nota;
        }
        System.out.print("As notas digitadas foram: \n"  + Arrays.toString(notas));
        System.out.printf("Média: %.2f", (media/tamanho) );

        entrada.close();

    }
}
