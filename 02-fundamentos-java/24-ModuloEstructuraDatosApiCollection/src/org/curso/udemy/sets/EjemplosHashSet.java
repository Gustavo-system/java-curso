package org.curso.udemy.sets;

import java.util.HashSet;
import java.util.Set;

public class EjemplosHashSet {
    public static void main(String[] args) {
        // se implementa una forma mas genérica de un HashSet, como Set
        Set<String> set = new HashSet<>();
        set.add("uno");
        set.add("dos");
        set.add("tres");
        set.add("cuatro");

        System.out.println(set);

        // se implementa un hashSet
        HashSet<String> hashSet = new HashSet<>();
        // se agrega un elemento a los hashSet
        hashSet.add("uno");
        hashSet.add("dos");
        hashSet.add("tres");
        hashSet.add("cuatro");

        System.out.println(hashSet);

        boolean duplicado = hashSet.add("tres");
        System.out.println("Se puede agregar un elemento repetido: " + duplicado);
        hashSet.add("cinco");
        System.out.println(hashSet);

    }
}
