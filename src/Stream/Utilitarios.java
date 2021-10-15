package Stream;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public interface Utilitarios {
    // alteramos de classe para interface, para que nao possa ser instanciado um novo utilitario ouuuu
    // podemos criar uma classe mas com o construtor do utilizatorios privado
    // nao pode ter metodo do tipo final em interface
    // segue um construtor privado
    //private Utilitarios(){
  //
  //  }

    public final static UnaryOperator<String> maiuscula =
            n -> n.toUpperCase();

    public final static UnaryOperator<String> primeiraLetra =
            n -> n.charAt(0) + "";

    public  static String grito (String n) {
        return n + "!!!";
    }
}
