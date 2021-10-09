package exercicios.colecoes.oo.heranca.desafio;

public class Ferrari extends Carro{
    @Override // significa que o metodo foi sobrescrito, não possui fins práticas, apenas para validação/identificacao
    void acelerar() {
        velocidadeAtual += 15;
    }
}
