package exercicios.colecoes.oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

        final List<Item> itens = new ArrayList<>();



        double obterValorTotal() {
                double total = 0;
                for(Item item: itens) {
                    total += item.quantidade * item.produto.preco;
                }
                return total;
        }

    public void adicionarItem(String caneta, int i) {
    }
}
