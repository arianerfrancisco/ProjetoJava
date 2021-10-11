package exercicios.colecoes.oo.heranca.desafio;

public class Ferrari extends Carro{
   // significa que o metodo foi sobrescrito, não possui fins práticas, apenas para validação/identificacao

    Ferrari(){
        this(315);
    }
    // ou deixando o usuario definir o parametro de velocidade maxima

    Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
    }


    void acelerar() {
        velocidadeAtual += 15;
    }
}
