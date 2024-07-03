package com.functional_interface.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerExample {
    public static void main(String[] args) {
//      Criar uma lista de números Inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 6, 8, 11, 12);

//        Usar o Consumer com expressão lambda p/ imprimir números pares
//        Consumer<Integer> imprimirNumeroPar = numero -> {
//            if (numero % 2 == 0) {
//                System.out.println(numero);
//            }
//        };

//        Usar Consumer para imprimir números pares no Stream + Predicate
        numeros.stream()
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);
    }
}
