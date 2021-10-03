package exercicios.fundamentos;

public class PrimitivoVsObjeto {
    // TUDO NO JAVA É OBJETO, EXCETO OS 8 TIPOS PRIMITIVOS. LOGO PODEMOS APLICAR METODOS A ELES
    // WRAPPERS SÃO AÇÕES QUE PODEMOS APLICAR AOS TIPOS PRIMITIVOS
    public static void main(String[] args) {
        String s = "Texto"; // string é uma classe e texto é um objeto
        s.toUpperCase(); // logo podemos buscar metodos de s com o uso do .

    }
}
