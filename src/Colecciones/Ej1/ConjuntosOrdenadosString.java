package Colecciones.Ej1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntosOrdenadosString {
    public static void main(String[] args) {
        TreeSet<String> c1 = new TreeSet<>();
        TreeSet<String> c2 = new TreeSet<>();


        c1.add("perro");
        c1.add("gato");
        c1.add("vaca");
        c1.removeLast();


        c2.add("loro");
        c2.add("koala");
        c2.add("mono");
        c2.add("gato");

        Set<String> c3 = new HashSet<>(c1);
        c3.addAll(c2);

        Set<String> c4 = new HashSet<>(c1);
        c4.removeAll(c2);

        System.out.println("c1: "+ c1);
        System.out.println("c2: "+ c2);
        System.out.println("c3: "+ c3);
        System.out.println("c4: "+ c4);
    }
}
