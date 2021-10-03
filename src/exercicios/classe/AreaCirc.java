package exercicios.classe;

public class AreaCirc {
    double raio;
    final static double PI = 3.14; // static: valor está associado a classe e não mais na instância
    // final não permite que o valor de pi seja alterado

    AreaCirc(double raioInicial) {
        raio = raioInicial;
    }
    static double area (double raio){
        return PI * Math.pow(raio, 2);
    }
}
