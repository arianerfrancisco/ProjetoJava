package Stream;

public class Media {
    private double total;
    private int quantidade;

   // public void adicionar(double valor){
   //     total += valor;
  //      quantidade ++;
  //  }
// MELHORANDO O METODO DA LINHA 7 A 10, QUE RETORNARÁ A PROPRIA MEDIA - PODENDO ENCADEAR ESSA FUNCAO
   public Media adicionar(double valor){
       total += valor;
       quantidade ++;
       return this;
       }

    public double getValor() {
        return total/quantidade;
    }

    public static Media combinar(Media m1, Media m2) {
       Media resultante = new Media();
       resultante.total = m1.total + m2.total;
       resultante.quantidade = m1.quantidade + m2.quantidade;
       return resultante;
    }
}
