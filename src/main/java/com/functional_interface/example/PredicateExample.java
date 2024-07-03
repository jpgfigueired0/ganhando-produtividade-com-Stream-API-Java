package com.functional_interface.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Representa uma funções que aceita um argumento do tipo T e retorna um valor booleano (V ou F).
 * É comumente ussada para filtrar os elementos do stream com base em alguma condição
 */
public class PredicateExample {
    public static void main(String[] args) {
        // Criar uma lista de palavras
        List<String> palavras = Arrays.asList("Java", "Python", "Angular", "Kotlin", "C", "Ruby", "javascript");

        // Criar um Predicate que verifica se a palavra tem mais de 5 caracteres
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        // Usar o Stream para filtrar ass palavras com mais de 5 caracteres e, em seguida,
        // imprimir cada palavra que passou no filtro
//        palavras.stream()
//                .filter(maisDeCincoCaracteres)
//                .forEach(System.out::println);

        palavras.stream()
                .filter(palavra -> palavra.length() > 5)
                .forEach(System.out::println);
    }

}
