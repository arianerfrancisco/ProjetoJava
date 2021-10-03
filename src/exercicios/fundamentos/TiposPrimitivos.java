package exercicios.fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Informações do funcionario

        // Tipos numéricos inteiros - a diferença é o range
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_134_845_223L; // se ultrapassar a capacidade coloca L

        // Tipos numéricos reais - a diferença é o range
        float salario = 11_445.44F; // colocar F para diferenciar do double - JAVA NÃO ANALISA O VALOR, MAS SIM O TIPO
        double vendasAcumuladas = 2_991_797_103.01; // dobro da capacidade do float

        // Tipo booleano
        boolean estaDeFerias = false; // true

        // Tipo caractere
        char status = 'A'; // ativo, só aceita uma única letra

        // Dias de empresa
        System.out.println(anosDeEmpresa * 365);

        // Número de viagens
        System.out.println(numeroDeVoos / 2);

        // Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": ganha -> " + salario);
        System.out.println("Férias? " + estaDeFerias);
        System.out.println("Status: " + status);
    }
}
