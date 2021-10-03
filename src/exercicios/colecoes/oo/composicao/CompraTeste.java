package exercicios.colecoes.oo.composicao;

public class CompraTeste {
    public static void main(String[] args) {
        Compra compra1 = new Compra();
        compra1.cliente = "João";
        compra1.itens.add ( new Item("Caneta", 20, 7.45));
        compra1.itens.add ( new Item("Borracha", 4, 1.35));
        compra1.itens.add ( new Item("Lápis", 2, 5));
        System.out.println(compra1.itens.size ());
        System.out.println(compra1.getValorTotal());
    }
}
