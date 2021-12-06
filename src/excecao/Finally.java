package excecao;

import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        try {
            System.out.println(7/ entrada.nextInt());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally { // garante que a entrada no teclado será encerrada. Tanto o try como o catch passarão pelo finally
            System.out.println("Finally");
            entrada.close();
        }
        System.out.println("Fim");
    }
}
