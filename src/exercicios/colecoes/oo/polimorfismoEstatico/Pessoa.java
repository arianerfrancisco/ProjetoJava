package exercicios.colecoes.oo.polimorfismoEstatico;

public class Pessoa {
    private double peso;

    public Pessoa(double peso) {
        setPeso(peso);
    }
    public void comer(Arroz arroz) {
        this.peso += arroz.getPeso();
    }
    public void comer(Feijão feijão) {
        this.peso += feijão.getPeso();
    }
    public void comer(Sorvete sorvete) {
        this.peso += sorvete.getPeso();
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
