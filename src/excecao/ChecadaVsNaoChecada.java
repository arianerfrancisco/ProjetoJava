package excecao;

public class ChecadaVsNaoChecada {
    public static void main(String[] args) {
        // envolver no try/catch : CTRl+ALT+T > opção 6
        try {
            geraErro1();
        } catch (RuntimeException e) {
            //e.printStackTrace(); >> dado como padrão
            System.out.println(e.getMessage());
        }
        try {
            geraErro2();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Fim!");
    }
    // não checada ou não verificada
    static void geraErro1(){
       throw new RuntimeException("Ocorreu um erro"); // throuw: lança o erro
        // quando se chama RuntimeException, que está em Exception o erro nao precisa ser tratado
        // os demais contidos em Exception é obrigados a serem tratados
    }
    // checada ou verificada
    static void geraErro2() throws Exception{
        throw new Exception("Ocorreu outro erro");

    }
}
