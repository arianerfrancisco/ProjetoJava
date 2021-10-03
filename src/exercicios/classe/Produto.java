package exercicios.classe;

public class Produto {

    String nome;
    double preco;
    double desconto;
    Produto(String nomeInicial) { //construtor
        nome = nomeInicial;
    }
    Produto() { //permiti que o nome não seja dado como parametro
    }

    double precoComDesconto() {
        return preco * (1 - desconto);
    }
}

