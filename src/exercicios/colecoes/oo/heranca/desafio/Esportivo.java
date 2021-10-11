package exercicios.colecoes.oo.heranca.desafio;

public interface Esportivo {
    // Interface tem metodos sem corpo
    void ligarTurbo();
    void desligarTurbo();
    // as classes que herdarem essa interface obrigatoriamente precisarão implementar esses metodos
    // no sentido de obedecer padrões
    // o comportamento desse metodo variarão de acordo com a classe filha. Ex: uma ferrari
    // se comportará diferentemente de um fusca
}
