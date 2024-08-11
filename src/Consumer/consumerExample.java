package Consumer;

import java.util.function.Consumer;

public class consumerExample {
    public static void main(String[] args) {
        //El consumer se utilizar para consumir un objeto sin devolver un resultado
        //En esto caso se utilizar para imprimir un objeto

        //Consumer<String> ImprimirMayuscula = str -> System.out.println(str.toUpperCase());
        //ImprimirMayuscula.accept("hello word");

        Consumer<String> ImprimirMayus = str -> System.out.println(str.toUpperCase());
        ImprimirMayus.accept("holaaaa");
    }
}
