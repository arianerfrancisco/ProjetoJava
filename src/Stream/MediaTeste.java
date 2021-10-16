package Stream;

public class MediaTeste {
    public static void main(String[] args) {

        Media m1 = new Media().adicionar(8.6).adicionar(6.7); // MELHORIA DO CODIGO DA LINHA 11, QUE FOI REALIZADO
        // DE UMA FORMA QUE DESENCADEA A INSTANCIA ATUAL
        Media m2 = new Media().adicionar(7.9).adicionar(6.6);
        System.out.println(m1.getValor());
        System.out.println(m2.getValor());

        System.out.println(Media.combinar(m1, m2).getValor());
    }
}
