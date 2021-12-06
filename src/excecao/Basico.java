package excecao;

public class Basico {
    public static void main(String[] args) {
        int erro = 7/0;
        System.out.println(erro); // como há um erro nesta linha, a execução do programa é interrompida.
        // para lidar com isso, recomenda-se tratar este erro
        try {
            System.out.println(erro);
        } catch (ArithmeticException e) {
            //e.printStackTrace();
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}
