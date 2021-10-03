package exercicios.array;
import java.util.Arrays;

public class Exercicios {
    public static void main(String[] args) {
        double[] notasAlunoA = new double[4];
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;
        notasAlunoA[3] = 8.7;

        System.out.println(Arrays.toString(notasAlunoA));

        double totalAlunoA = 0;
        for (int i=0; i < notasAlunoA.length; i++) {
            totalAlunoA += notasAlunoA[i];
        }
        System.out.println(totalAlunoA); // pode ser realizado operacoes matematicas com esse totalAlunoA
        System.out.println(notasAlunoA[2]);
        System.out.println(notasAlunoA.length -1);// extrai o valor do ultimo indice

        // -------- OUTRA FORMA DE INICIALIZAR UM ARRAY COM VALORES DEFINIDOS--------//

        final double notaArmazenada = 0;
        double [] notasAlunoB = {6.9,3.5,9.6, notaArmazenada, 10};
        double totalAlunoB = 0;
        for (int i=0; i < notasAlunoB.length; i++) {
            totalAlunoB += notasAlunoB[i];
        }
        System.out.println(Arrays.toString(notasAlunoB));
        System.out.println(totalAlunoB);

}
}
