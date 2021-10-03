package exercicios.classe;

public class AreaCircTeste {
    public static void main(String[] args) {
        AreaCirc a = new AreaCirc(5); // intanciando a classe AreaCirc com 10 parametro de raio / pi assumirá o padrão
       // a.pi=10; // aqui o valor padrão de pi é alterado > feito antes de se torna static
       // AreaCirc.PI=3.1415; // só assim para alterar seu valor apos ter definido como static, antes de colocar static final

        System.out.println(a.area(5)); //chamando o método

        // podemos instanciar diretamente no system
        System.out.println(AreaCirc.area(2));
    }
}
