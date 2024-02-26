package Excepciones;

import java.util.Scanner;

public class CadenaTexto {
    public static void main(String[] args) {
        Scanner scStr = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);

        System.out.println("Introduce una cadena de texto");
        String cadena = scStr.nextLine();
        System.out.println("Introduce un numero de para mostrar por pantalla el caracter correspondiente a esa posicion en la cadena");
        int posicion = scInt.nextInt();

        try {
            if (posicion < 1  ||  posicion > cadena.length()) throw new ExcepcionOutOfBounds("El número introducido no pertenece a ninguna posicion de la cadena");
            System.out.println(cadena.charAt(posicion-1));
        }
        catch (ExcepcionOutOfBounds ex1){
            System.out.println(ex1.getMessage());
        }
    }
}
