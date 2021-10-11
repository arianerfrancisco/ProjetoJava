package exercicios.colecoes.oo.polimorfismoDinamico;

public class Comida {
    // aqui se tornará a classe principal>> e arroz, feijão e sorvete herdarão o comportamento daqui
    // comportamento de polimorfismo dinamico
    private double peso;

    public Comida(double peso) {
        setPeso(peso);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(peso >=0) {
            this.peso = peso;
        }
    }
}
