package lambdas;

@FunctionalInterface // >> marca que a interface terá apenas um unico metodo abstrato- VALIDAÇÃO
// ESTRATÉGIA, que garante o uso funcional das lambdas
public interface Calculo {
    double executar (double a, double b);
}
