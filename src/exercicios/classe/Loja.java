package exercicios.classe;

public class Loja {
    String nome;
    double preco;
    static double desconto = 0.25; // remove do construtor - Por boa prática, caso queiramos alterar
    // deverá ser feito explicitamente >>  Loja.desconto = 0.50;

    Loja() {
    }

    Loja(String nomeInicial, double precoInicial) {
        nome= nomeInicial;
        preco = precoInicial;
    }
    double precoComDesconto(){
          return preco * (1-desconto);
    }
    double precoComDesconto(double descontoDoGerente){
        return preco * (1-desconto - descontoDoGerente);
    }

}

