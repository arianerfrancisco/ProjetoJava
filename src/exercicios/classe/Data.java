package exercicios.classe;

public class Data {
    int dia; // ESSA DECLARAÇÃO TORNA AS VARIAVEIS DISPONIVEIS POR TODOS OS METODOS DESTA CLASSE
    int mes;
    int ano;

    Data() {
        // definindo valores padrões no parametro caso os mesmo não sejam dados pelos usuarios
        this(1, 1, 1970); // SO FUNCIONA EM CONSTRUTOR
    }

    Data(int dia, int mes, int ano) {
        this.dia = dia; // ATRIBUIR O PARAMETRO FORNECIDO PARA O ATRIBUTO DESTA CLASSE SEM GERAR CONFLITO DE NOME
        this.mes = mes; // THIS - REFERENCIAR OBJETO ATUAL
        this.ano = ano;
    }
// PARA QUE UMA VARIÁVEL FIQUE DISPONIVEL DENTRO DE UMA CLASSE, ELA PRECISA SER DECLARADA FORA DOS METODOS. VER LINHA 4

    String obterDataFormatada() {
        final String formato = "%d/%d/%d"; // TORNA CONSTANTE // A FORMA QUE ESTÁ DEFINIDA PERTENCE SOMENTE A ESSE METODO
        return String.format(formato, this.dia, mes, ano);
    }

    void imprimirDataFormatada() {
        System.out.println(this.obterDataFormatada());
    } // NAO FUNCIONA PARA METODO ESTATICO
    }


