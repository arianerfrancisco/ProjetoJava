package exercicios.classe;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook"); //Instanciando a classe produto
       // p1.nome = "Notebook";
        p1.preco= 4356.89;
        p1.desconto= 0.25;

        System.out.println(p1.precoComDesconto());
    }
}
