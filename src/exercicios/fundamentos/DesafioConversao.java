package exercicios.fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        // input de tres strings de salario// calcular a media / Obs: o usuario pode utilizar ponto ou virgula para separar as casas decimais
        Scanner teclado = new Scanner(System.in); // podemos declarar scanner com o nome que desjarmos

        System.out.println("Digite seu salário: ");
        String salario1 = teclado.nextLine();

        System.out.println("Digite seu salário: ");
        String salario2 = teclado.nextLine();

        System.out.println("Digite seu salário: ");
        String salario3 = teclado.nextLine();

        double salario11 = Double.parseDouble(salario1.replace(',','.'));
        double salario22 = Double.parseDouble(salario2.replace(',','.'));
        double salario33 = Double.parseDouble(salario3.replace(',','.'));

        double media= (salario11 + salario22 + salario33)/3;
        System.out.printf("A média de salário digitados foi: " + media);

        // _____________ MÉTODO PROFESSOR ____________

        System.out.print("Informe o primeiro salário:");
        String valor1 = teclado.next().replace(",", ".");

        System.out.print("Informe o segundo salário:");
        String valor2 = teclado.next().replace(",", ".");

        System.out.print("Informe o terceiro salário:");
        String valor3 = teclado.next().replace(",", ".");

        double salario111 = Double.parseDouble(valor1);
        double salario222 = Double.parseDouble(valor2);
        double salario333 = Double.parseDouble(valor3);

        double media1 = (salario111 + salario222 + salario333) / 3;
        System.out.println("A média dos salários é " + media1);

        teclado.close();
    }
}
