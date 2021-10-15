package Stream;

public class Produtos {
    final String nome;
    final double preco;
    final double desconto;
    final boolean freteGratis;

    public Produtos(String nome, double preco, double desconto, boolean freteGratis) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
        this.freteGratis = freteGratis;
    }
}
