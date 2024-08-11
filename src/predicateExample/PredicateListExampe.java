package predicateExample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateListExampe {
    public static void main(String[] args) {
//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        numbers.add(4);
//        numbers.add(5);
//
//        //usamos la interfaz funcional predicate para verificar si hay un numero par
//        Predicate<Integer> isNumberNueve = number -> number % 2 == 0;
//
//        //Filtramos la lista usando Predicate
//        List<Integer> numerosPar = new ArrayList<>();
//
//        for(Integer number: numbers){
//            if (isNumberNueve.test(number)){
//                numerosPar.add(number);
//            }
//        }
//
//        System.out.println("Numero par: "+ numerosPar);


        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        //vamos evaluar cuales de esos numeros son impar
        Predicate<Integer> IsnumerosImpar = number -> number % 2 != 0;
        List<Integer> numeroImpar = new ArrayList<>();

        for (Integer numero : numeros){
            if(IsnumerosImpar.test(numero)){
                numeroImpar.add(numero);
            }
        }

        System.out.println("Impares: "+ numeroImpar);
    }
}
