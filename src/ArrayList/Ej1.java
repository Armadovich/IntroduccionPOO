package ArrayList;

import java.util.ArrayList;
import java.util.Objects;

public class Ej1 {
    static ArrayList<String> lista = new ArrayList<>();

    public static void setLista() {
        lista.add("uno");
        lista.add("dos");
        lista.add("tres");
        lista.add("cuatro");
        lista.add("cinco");
    }
    public static void verLista(){
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + "->" +lista.get(i));
        }
    }
    public static int buscarNombre(String nombre){
        for (int i = 0; i < lista.size(); i++) {
            if (Objects.equals(lista.get(i), nombre)){
                System.out.println("Encontrado igual en posición "+i+"\n");
                return i;
            }
        }
        return 0;
    }

    public static void eliminarNombre(String nombre){
        lista.remove(buscarNombre(nombre));
    }

    public static void main(String[] args) {
        setLista();
        verLista();
        buscarNombre("cuatro");
        eliminarNombre("dos");
        verLista();
    }
}
