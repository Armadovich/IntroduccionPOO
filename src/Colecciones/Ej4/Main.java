package Colecciones.Ej4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    static HashMap<Integer, Alumno> alumnos = new HashMap<>();
    public static void inserciones(HashMap <Integer, Alumno> alumnos){
        alumnos.put(1, new Alumno("39466058J", "Daniel Armada", 23, "Cangas"));
        alumnos.put(2, new Alumno("86486413F", "Breogán Lodeiro", 20, "Hío"));
        alumnos.put(3, new Alumno("13548648D", "Daniel Pérez", 24, "Vigo"));
    }
    public static void conteoAlumnos(HashMap <Integer, Alumno> alumnos){
        System.out.println("Nº de alumnos: "+alumnos.size());
    }
    public static void mostrarAlumno(int cod){
        if (!alumnos.containsKey(cod)){
            System.out.println("El alumno no se encuentra en la base de datos");
        }
        else {
            System.out.println(alumnos.get(cod).toString());
        }
    }
    public static void eliminarAlumno(int cod){
        alumnos.remove(cod);
    }
    public static void main(String[] args) {
        inserciones(alumnos);
        conteoAlumnos(alumnos);
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce codigo del alumno para ver sus datos");
        mostrarAlumno(sc.nextInt());
        System.out.println("Introduce codigo del alumno para eliminarlo de la base de datos");
        eliminarAlumno(sc.nextInt());
        System.out.println(alumnos);
    }
}
