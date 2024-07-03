package com.functional_interface.example;

import java.util.Optional;

/**
 *
 */
public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optionalValue = Optional.ofNullable(null);
        String result = optionalValue.orElseGet(() -> "Value from Supplier");
        String result2 = optionalValue.orElseThrow(() -> new RuntimeException("Value not present"));
        System.out.println(result);
    }
}
