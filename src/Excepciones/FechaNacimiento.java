package Excepciones;

import java.util.Scanner;

public class FechaNacimiento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu fecha de nacimiento");

        int fecha = sc.nextInt();
        try {
            if (fecha < 0) throw new IllegalArgumentException();
            System.out.println("Fecha introducida correctamente : "+fecha);
        }catch (IllegalArgumentException ex){
            System.out.println("Número introducido negativo");
        }

    }

}
