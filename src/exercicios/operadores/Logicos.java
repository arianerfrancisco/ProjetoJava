package exercicios.operadores;

public class Logicos {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = 3 > 7;

        System.out.println(condicao1 && !condicao2); //AND
        System.out.println(condicao1 || condicao2); // OR
        System.out.println(condicao1 ^ condicao2);
        System.out.println(!!condicao1);
        System.out.println(!condicao2);

        System.out.println("Tabela verdade E (AND)");
        System.out.println(true && true);
        System.out.println(true && false);
//		System.out.println(false && true);
//		System.out.println(false && false);

        System.out.println("\nTabela verdade OU (OR)");
//		System.out.println(true || true);
//		System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println("\nTabela verdade OU Exclusivo (XOR)");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);
        // Ou exclusivo ou disjunção exclusiva é uma operação lógica entre dois operandos que resulta em um valor lógico verdadeiro
        // se e somente se os dois operandos forem diferentes, ou seja, se um for verdadeiro e o outro for falso.

        System.out.println("\nTabela verdade NOT");
        System.out.println(!true); // OPERADOR UNÁRIO
        System.out.println(!false);
    }
}
