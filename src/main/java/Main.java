package main.java;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> furcsaLista = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(furcsaLista.getClass());
        furcsaLista.remove(2);  // Ha ezt kikommenteled, lefut.
    }

}
