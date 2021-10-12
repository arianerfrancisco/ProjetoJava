package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
    public static void main(String[] args) {
        // ABORDAGEM FUNCIONAL
        UnaryOperator<Integer> maisDois= n -> n + 2;
        UnaryOperator<Integer> vezesDois= n -> n * 2;
        UnaryOperator<Integer> aoQuadrado= n -> n * n;

        int resultado1 = maisDois // encadeamento de funcoes - aqui segue o calculo da esquerda para direita
                // - DENTRO PARA FORA
                .andThen(vezesDois)
                .andThen(aoQuadrado)
                .apply(0);
        System.out.println(resultado1);

        int resultado2 = aoQuadrado // aqui os calculos são feitos da direita para esquerda
                // FORA PARA DENTRO
                .compose(vezesDois)
                .compose(maisDois)
                .apply(0);
        System.out.println(resultado2);

    }
}
