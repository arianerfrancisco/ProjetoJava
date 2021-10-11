package exercicios.colecoes.oo.abstrato;

public class Cachorro extends Mamifero{
    // apenas nas classes conctretas que implementamos os comportamentos
    // na abstrata podemos deixar metodos ''inacabados''

    @Override
    public String mamar() {
        return "Usando leite";
    }
}
