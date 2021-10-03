package exercicios.fundamentos;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Olá pessoal".charAt(2)); // vai colocar a letra no indice 2

        String s = "Boa tarde"; // podemos manipular s, mas não podemos alterar seu valor inicial vide linha 16
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!"); // idem linha 8
        System.out.println(s.startsWith("Boa")); // s inicia com a palavra "Boa"? resp: true ou false
        System.out.println(s.toLowerCase().startsWith("boa")); // caso não tivesse transformado com  .toLowerCase() seria false
        System.out.println(s.toUpperCase().endsWith("TARDE"));
        System.out.println(s.length());
        System.out.println(s.toLowerCase().equals("boa tarde")); // comparação de igualdade
        System.out.println(s.equalsIgnoreCase("boa tarde")); // comparação, mas ignora se estiver maiusculo ou minusculo
        System.out.println(s); // apesar de todas as manipulações, o valor original s é mantido

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.987;

        String maisUmaFrase = "Nome: " + nome + "\nSobrenome: " // \n > pula a linha
                + sobrenome + "\nIdade: " + idade +
                "\nSalario: " + salario + "\n\n";
        System.out.println(maisUmaFrase);

        // melhor prática abaixo
        System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.", // SE ATENTAR AO PRINTF >>> SIGNIFICADO PRINT FORMATADO ***************
                nome, sobrenome, idade, salario);

        String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f.",
                nome, sobrenome, idade, salario);
        System.out.println(frase);

        System.out.println("Frase qualquer".contains("qual"));// contem?
        System.out.println("Frase qualquer".indexOf("qual"));// qual indice começa a palavra qual?
        System.out.println("Frase qualquer".substring(6)); // começar a string a partir do indice 6
        System.out.println("Frase qualquer".substring(6, 10)); // escrever a string entre o indice 6 e 10, excluindo o 10
    }
}
