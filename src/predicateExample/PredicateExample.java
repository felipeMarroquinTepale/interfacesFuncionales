package predicateExample;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        //Usar la interfaz predicate para verifica si un numero es mayor que 10

        //La interfaz funcion predicate se usa para evaluar una condicion sobre un objeto
        Predicate<Integer> IsMenor0 = number -> number < 0;
        System.out.println(IsMenor0.test(10));
        System.out.println(IsMenor0.test(30));

        Predicate<Integer> IsMayorQue10 = number -> number > 10;
        System.out.println(IsMayorQue10.test(15));
        System.out.println(IsMayorQue10.test(9));

    }
}