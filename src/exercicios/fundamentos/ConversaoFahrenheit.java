package exercicios.fundamentos;

public class ConversaoFahrenheit {

    public static void main(String[] args) {
        double fahrenheit = 86;
        final double ajuste = 32 ;
        final  double fator = 5.0/9.0 ;
        double conversao = (fahrenheit - ajuste) * fator; // se atentar de acrescentar a casa decimal por ter sido declarada como double
        System.out.println(" A conversão de fahrenheit para celsius é : " + conversao + "º" );
    }
}
