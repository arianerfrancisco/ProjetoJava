package exercicios.colecoes.oo.encapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Pedro",30);
        System.out.println(p1.getIdade());
        //p1.idade = -30; // alterar o valor da variavel somente se esta na classe de origem estiver como public
        p1.setIdade(50);

        System.out.println(p1.getIdade()); // lendo o valor da variavel
        System.out.println(p1);
    }
}
