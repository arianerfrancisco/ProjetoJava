package exercicios.classe;

public class PrimeiroTrauma {
    int a = 3;
    static int b = 5;
    public static void main(String[] args) {
    // SOBRE ATRIBUTOS ESTÁTICOS
        PrimeiroTrauma p = new PrimeiroTrauma(); // dentro de static só acessamos uma instância se criarmos uma instancia
        System.out.println(p.a);

        // mas podemos instanciar como static, dai tornar possivel acessa-lo aqui dentro
        System.out.println(b);
    }
}
