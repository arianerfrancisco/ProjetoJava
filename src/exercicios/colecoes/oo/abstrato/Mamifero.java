package exercicios.colecoes.oo.abstrato;

public abstract class Mamifero extends Animal {

    public abstract String mamar();
    public final String mover() { // final- nenhuma classe filha poderá sobrescrever esse metodo
        return "Saindo do lugar";
    }

}

