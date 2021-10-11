package exercicios.colecoes.oo.encapsulamento.casaA;

public class Paulo {
    // CONTEXTO DENTRO DO MESMO PACOTE
    Ana esposa = new Ana();
    void testeAcessos(){
        //private String segredo = "....";
        //String facaDentroDeCasa="...";
        //protected String formaDeFalar=".....";
        //public String todosSabem="....";
       //  System.out.println(esposa.segredos); -- UNICO NÃO VISIVEL
        System.out.println(esposa.facaDentroDeCasa);
        System.out.println(esposa.formaDeFalar);
        System.out.println(esposa.todosSabem);
    }
}
