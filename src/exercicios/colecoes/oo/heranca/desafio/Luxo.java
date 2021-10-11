package exercicios.colecoes.oo.heranca.desafio;

public interface Luxo {
    public abstract void ligarAr();
    public abstract void desligarAr();

    default int velocidadeDoAr() {
        return 1;
    }
    // apesar de ser padrão os metodos serem publicos e abstratos
    // é possivel implementar um metodo padrão. Sendo assim, as classes herdadas nao sao obrigadas a implementar
    // esse metodo
}
