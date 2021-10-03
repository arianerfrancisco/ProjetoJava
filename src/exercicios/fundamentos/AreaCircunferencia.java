package exercicios.fundamentos;

public class AreaCircunferencia {
    public static void main(String[] args) {
        double raio = 3.4;
        double pi = 3.14159;
        final double area = pi*raio*raio; // irá congelar o valor

        System.out.println(area);
        System.out.println("Area = " + area + " m2." );
    }
}
