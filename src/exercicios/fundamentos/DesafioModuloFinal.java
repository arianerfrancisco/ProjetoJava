package exercicios.fundamentos;
import java.util.Scanner;


public class DesafioModuloFinal {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro valor:");
        double n1= entrada.nextDouble(); // esvazia o buffer do teclado
        System.out.println("Digite o segundo valor:");
        double n2= entrada.nextDouble(); // esvazia o buffer do teclado

        System.out.println("Escolha uma operacao:" +
                " (+) Soma" +
                " (-) Subtração" +
                " ('/') Divisão" +
                " (*) Multiplicação" +
                " (%) Módulo");

        String op= entrada.next();

        double resultado;
        resultado = "+".equals(op) ? n1 + n2 : 0;
        resultado = "-".equals(op) ? n1 - n2 : resultado;
        resultado = "/".equals(op) ? n1 / n2 : resultado;
        resultado = "%".equals(op) ? n1 % n2 : resultado;
        resultado = "*".equals(op) ? n1 * n2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f", n1, op, n2, resultado);

        entrada.close();
    }

}
