package exercicios.colecoes.oo.heranca;

public class Jogo {
    public static void main(String[] args) {
        Monstro monstro = new Monstro();
        monstro.y = 10;
        monstro.x = 10;

        Heroi heroi = new Heroi();
        heroi.y = 10;
        heroi.x = 11;

        System.out.println(monstro.vida);
        System.out.println(heroi.vida);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println(monstro.vida);
        System.out.println(heroi.vida);

        monstro.andar(Direcao.NORTE); // como ele se afastou o heroi
        monstro.atacar(heroi); // não vai conseguir atacar
        heroi.atacar(monstro);

        System.out.println(monstro.vida);
        System.out.println(heroi.vida);
    }
}
