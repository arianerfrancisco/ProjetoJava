package exercicios.colecoes.oo.heranca.desafio;

public class Carro {

    final int VELOCIDADE_MAXIMA;
    int velocidadeAtual;

    Carro(int velocidademaxima){
        VELOCIDADE_MAXIMA = velocidademaxima;
    }

    void acelerar() { // quando utiliza void não precisa colocar return
        if (velocidadeAtual + 5 > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += 5;
        }
    }

    void frear() {
        if (velocidadeAtual >=5) {
            velocidadeAtual -= 5;
        } else {
            velocidadeAtual = 0; // uma forma de garantir que a velocidade zere quando freie
        }
    }

    public String toString() {
        return "Velocidade atual é: " + velocidadeAtual + "Km";
    }
}

