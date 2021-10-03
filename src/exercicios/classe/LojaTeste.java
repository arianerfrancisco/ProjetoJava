package exercicios.classe;

public class LojaTeste {
    public static void main(String[] args) {
        Loja p1 = new Loja("Notebook", 52);

        System.out.printf(" O preço padrão do %s é: R$%.2f reais \n " +
                "Mas, com o desconto do dia das mães fica por apenas: R$%.2f reais \n\n",
                p1.nome, p1.precoComDesconto(), p1.precoComDesconto(0.3));
        // caso queiramos alterar o valor de desconto, precisaremos fazer de forma explicita

        Loja.desconto = 0.50; // a partir daqui o desconto assume outro valor

        Loja p2 = new Loja("Caneta", 52);

        System.out.printf(" O preço padrão da %s é: R$%.2f reais \n " +
                        "Mas, com o desconto do dia das mães fica por apenas: R$%.2f reais",
                p2.nome, p2.precoComDesconto(), p2.precoComDesconto(0.3));



    }
}
