package Supplier;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
//        Supplier<Integer> randomSupplier = () -> new Random().nextInt(100);
//
//        //Obtener y mostrar numero aleatorio de 1-100
//        System.out.println("2 numero random: "+ randomSupplier.get());
//        System.out.println("2 numero rando: "+ randomSupplier.get());

        Supplier<Integer> numeroAleatorios = ()-> new Random().nextInt(100);
        System.out.println(numeroAleatorios.get());
        System.out.println(numeroAleatorios.get());
    }
}
