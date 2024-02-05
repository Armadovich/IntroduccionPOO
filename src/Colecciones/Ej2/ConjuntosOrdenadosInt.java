package Colecciones.Ej2;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntosOrdenadosInt {
    public static void main(String[] args) {

        TreeSet<Integer> c1 = new TreeSet<>();
        TreeSet<Integer> c2 = new TreeSet<>();


        c1.add(1);
        c1.add(2);
        c1.add(3);
        c1.removeLast();


        c2.add(3);
        c2.add(5);
        c2.add(4);
        c2.add(2);

        TreeSet<Integer> c3 = new TreeSet<>(c1);
        c3.addAll(c2);

        TreeSet<Integer> c4 = new TreeSet<>(c1);
        c4.removeAll(c2);

        TreeSet<Integer> c5 = new TreeSet<>(c1);
        c5.retainAll(c2);

        System.out.println("c1: "+ c1);
        System.out.println("c2: "+ c2);
        System.out.println("c3: "+ c3);
        System.out.println("c4: "+ c4);
        System.out.println("c5: "+ c5);

    }
}
