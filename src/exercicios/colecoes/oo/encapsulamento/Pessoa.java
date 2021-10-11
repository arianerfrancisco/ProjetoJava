package exercicios.colecoes.oo.encapsulamento;

public class Pessoa {
    private String nome;
   private int idade; // com private, somente aqui no escopo desta classe, os dados poderão ser alterados

    public Pessoa( String nome, int idade) {
        setIdade(idade);
        setNome(nome);// irá garantir que no construtor não seja inserido idades negativas
    }
    // Getter
    public int getIdade(){ // agora a leitura da idade se tornou acessivel fora deste escopo
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    // Setter
    public void setIdade(int novaIdade) { // agora torna-se possivel alterar este dado fora deste escopo
        novaIdade = Math.abs(novaIdade);
       if(novaIdade >=0 && novaIdade <=120)  { // para garantir que idades negativas não sejam inseridas
           this.idade= novaIdade;
       }
    }
    public String toString(){
        return "Olá eu sou o: " + getNome()
                + " tenho " + getIdade() + " anos. ";
    }


}
