package exercicios.colecoes.oo.encapsulamento.casaB;

import exercicios.colecoes.oo.encapsulamento.casaA.Ana;

public class Julia {
    void testeAcessos(){
        Ana sogra = new Ana();
        //private String segredo = "....";
        //String facaDentroDeCasa="..."; >> acesso padrão por pacote
        //protected String formaDeFalar=".....";
        //public String todosSabem="....";
        //  System.out.println(esposa.segredos); -- UNICO NÃO VISIVEL
        //System.out.println(sogra.facaDentroDeCasa); não acessa,  pois não estão no mesmo pacote
        //System.out.println(sogra.formaDeFalar); não acessa, pois não foi utilizado herança
        System.out.println(sogra.todosSabem); // acessa pois é um acesso publico
    }
}

