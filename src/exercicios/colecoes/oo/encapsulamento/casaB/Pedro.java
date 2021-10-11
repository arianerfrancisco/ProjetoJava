package exercicios.colecoes.oo.encapsulamento.casaB;

import exercicios.colecoes.oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
    // contexto > pedro filho de ana;
    //private String segredo = "....";
    //String facaDentroDeCasa="...";
    //protected String formaDeFalar=".....";
    //public String todosSabem="....";
   // System.out.println(mae.segredos); - nao consegue acessar pois é privado na ana
   //  System.out.println(mae.facaDentroDeCasa); - - nao consegue acessar pois não estão no mesmo pacote
    void testeAcessos(){
        System.out.println(formaDeFalar); // conseguiu acessar este atributo via herança
        System.out.println(todosSabem);
    }
}

// para ter acesso ao conteudo por herança, não precisa instanciar como é feito no contexto de composição
// apenas colocar a palavra extends
