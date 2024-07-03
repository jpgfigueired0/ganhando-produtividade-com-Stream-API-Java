package com.functional_interface.example;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comumente usada para criar oou fornecer novos objetos de um determinado tipo.
 */
public class SupplierExample {
    public static void main(String[] args) {
        // usar o Supplier com expressão lambda para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

        // #1 Usar o Supplier para obter uma lista com 5 saudações
        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(5)
                .toList();

        // #2 Usar o Supplier para obter uma lista com 5 saudações com lambada
        List<String> listaSaudacoes2 = Stream.generate(() -> "Olá seja bem vindo!")
                .limit(5)
                .toList();

        // Imprimir as saudações geradas com method reference
        // Ou listaSaudacoes.forEach(s -> System.out.println(s));
        listaSaudacoes2.forEach(System.out::println);

    }
}