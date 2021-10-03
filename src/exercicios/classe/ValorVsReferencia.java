package exercicios.classe;

public class ValorVsReferencia {
    public static void main(String[] args) {
        double a = 2;
        double b = a; // atribuicao por valor (trabalhando com tipo primitivo)
        a++;
        b--;
        System.out.println(" Os valores de a e b são independentes");
        System.out.println( a + " " + b);

        Data d1 = new Data(1,6,2022);
        Data d2 = d1; // atribuicao por referência (trabalhando com Objeto)

        d1.dia=31;
        d2.dia=25;
        System.out.println(" Os valores de d1 e d2 apontam para o mesmo local da memória");
        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

    }
}
