package exercicios.fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {
        String s =" Bom dia X";
        s = s.toUpperCase(); // precisa armazenar o metodo em uma variavel para ser acionada posteriormente
        System.out.println(s);
        s = s.replace("X", "Senhora");
        System.out.println(s);
        s = s.concat("!!!");
        System.out.println(s);
        // podemos acessar os metodos diretamente no System.out.println();
        System.out.println("Leo".toUpperCase()); // ou

        String x = "Joao"
                .toUpperCase(); // podemos quebrar a linha no ponto - boa prática para varios metodos desde que seja logica a sequencia
        System.out.println(x);
        // não existe esse comportamento para os 8 tipos primitivos, por exemplo int = 10. Não existem atributos "." associados a ele.
    }
}
