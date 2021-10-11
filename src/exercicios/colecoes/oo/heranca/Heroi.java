package exercicios.colecoes.oo.heranca;

public class Heroi extends Jogador{
    public boolean vida;

    // ao inves de reescrever como no monstro, utiliza-se super
    public boolean atacar(Jogador oponente) { // ataque força tripla
        boolean ataque1 = super.atacar(oponente);
        boolean ataque2 = super.atacar(oponente);
        boolean ataque3 = super.atacar(oponente);
        return ataque1 || ataque2 || ataque3;
    }
}
