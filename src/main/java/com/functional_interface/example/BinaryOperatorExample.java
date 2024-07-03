package com.functional_interface.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * Representa uma operação que combina dois argumentos do tipo T e e retorna um resultado do mesmo tipo T.
 * É usada para realizar operaçoes de redução em pares de elementos, como somar números ou combinar objetos.
 */
public class BinaryOperatorExample {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usar o BinaryOperator com expressão lambda para somar dois números inteiros
        BinaryOperator<Integer> somar = Integer::sum;

        // Usar o Binary para somar todos os números no Stream
        int resultado1 = numeros.stream()
                .reduce(0, somar);

        int resultado2 = numeros.stream()
                .reduce(0, (num1, num2) -> num1 + num2);

        System.out.println("A soma dos resultados é: " + resultado2);
    }
}