package Colecciones.Ej3;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<Integer, String> provincias = new HashMap<>();
        provincias.put(36, "Pontevedra");
        provincias.put(15, "A Coruña");
        provincias.put(27, "Lugo");
        provincias.put(32, "Ourense");

        mostrarDatos(provincias);
        mostrarProvincia(provincias);
        eliminarProvincias(provincias);
        mostrarDatos(provincias);
    }
    static Scanner sc = new Scanner(System.in);
    public static void mostrarDatos(HashMap<Integer, String> provincias){
        System.out.println(provincias);
    }
    public static void mostrarProvincia(HashMap<Integer, String> provincias){
        System.out.println("Introduce un codigo de provincia");
        int cod = sc.nextInt();
        if (provincias.containsKey(cod)){
            System.out.println(provincias.get(cod));
        }
        else{
            System.out.println("El código no se encuentra en la base de datos");
        }
    }
    public static void eliminarProvincias(HashMap<Integer, String> provincias){
        provincias.remove(36);
        provincias.remove(27);
    }
}
