package LIFO;

import java.util.Arrays;

public class Pila implements CollectionInterface {

    private Object[] array;
    private int contador;

    public Pila(Object[] array, int contador) {
        this.array = array;
        this.contador = 0;
    }


    @Override
    public boolean isEmpty() {
        return array.length == 0;
    }

    @Override
    public Object first() {
        return Arrays.stream(array).findFirst();
    }

    @Override
    public boolean add(Object objeto) {
        return false;
    }

    @Override
    public Object get() {
        Object intermediario = Arrays.stream(array).findFirst();
        for (int i = 0; i < array.length-1; i++) {
            array[i] = array[i+1];
        }
        array[array.length-1] = null;
        return intermediario;
    }

}
