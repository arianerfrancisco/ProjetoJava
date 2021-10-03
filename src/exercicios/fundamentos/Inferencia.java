package exercicios.fundamentos;

public class Inferencia {
    public static void main(String[] args) {
        double a = 4.5; // declaração e inicialização
        System.out.println(a);

        a = 12;
        System.out.println(a);

        // a = "..."; // não aceita alteração do tipo de variável

        var b = 4.5;
        System.out.println(b);

        var c = "Texto";
        System.out.println(c);

        c = "Outro texto";
        System.out.println(c);

        // c = 4.5; // não aceita alteração do tipo de variável

        double d; // variável foi declarada
        d = 123.65; // variável foi inicializada
        System.out.println(d); // usada!

        var e = 123.45; // quando utiliza-se var só inicialidade se for atribuida um valor se colocassemos apenas var e / na linha de baixo e=12 * nao funcionará
        System.out.println(e);

        var f = 12; // inteiro
        // f = 12.01; // ele altera de inteiro para decimal, mas não ao contrário.
        System.out.println(f);
    }
}
