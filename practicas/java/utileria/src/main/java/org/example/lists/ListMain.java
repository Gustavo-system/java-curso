package org.example.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        SuperHeroe superHeroe = new SuperHeroe();

        List<String> poderes = new ArrayList<>(Arrays.asList("Telaraña", "Escalar")) ;

        superHeroe.setNombre("Spiterman");
        superHeroe.setPoderes(getPoderes());

        System.out.println(superHeroe);
    }

    public static List<String> getPoderes() {
        return new ArrayList<>(Arrays.asList("Telaraña", "Escalar"));
    }
}
