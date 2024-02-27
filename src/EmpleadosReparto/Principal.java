package EmpleadosReparto;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Principal {
    static ArrayList<Empleado> empleadoArrayList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static final int NAME_MAX_LENGTH = 20;
    public static void main(String[] args) throws ExcepcionEmpleado {

        int input = 0;

        while (input != 3){
            System.out.println("###############################");
            System.out.println("input 1 = Agregar empleado");
            System.out.println("input 2 = Mostrar empleados");
            System.out.println("input 3 = Salir del programa");

            try {
                input = sc.nextInt();

                if (input == 1){
                    agregarEmpleado();
                }
                else if (input == 2){
                   // mostrarEmpleado();
                } else if (input == 3) {
                    System.out.println("Saliendo...");
                }
                else{
                    throw new ExcepcionEmpleado(ExcepcionEmpleado.WRONG_INPUT);
                    //break;
                }
            } catch (ExcepcionEmpleado | InputMismatchException exception) {
                System.out.println("*** ERROR: Input inválido");
                sc.next();
            }
        }
    }

    public static void agregarEmpleado() throws ExcepcionEmpleado {

        System.out.println("Seleccione tipo de empleado");
        System.out.println("input 1 = Comercial");
        System.out.println("input 2 = Repartidor");
        sc.nextLine();
        try {
            int input = sc.nextInt();
            if (input == 1) agregarComercial();
            else if (input == 2) agregarRepartidor();
            else throw new ExcepcionEmpleado(ExcepcionEmpleado.WRONG_INPUT);
        }
        catch (ExcepcionEmpleado | InputMismatchException e){
            System.out.print("*** ERROR: Input inválido");;
            agregarEmpleado();
        }





        if (input == 1){
            System.out.println("INTRODUCE:");
            System.out.println("nombre (Máx 20 caracteres)");
            String nombre = sc.nextLine();
            comprobarNombre(nombre);
            System.out.println("Introduce edad");
            int edad = sc.nextInt();
            comprobarEdad(edad);
        }
    }

//    public static void comprobarNombre(String nombre) throws ExcepcionEmpleado {
//        Pattern pat = Pattern.compile("[a-zA-Z]");
//        Matcher mat = pat.matcher(nombre);
//        if (!mat.matches()){
//            throw new ExcepcionEmpleado(ExcepcionEmpleado.WRONG_CHARACTERS);
//        }
//        if (nombre.length() > NAME_MAX_LENGTH){
//            throw new ExcepcionEmpleado(ExcepcionEmpleado.WRONG_NAME_LENGHT);
//        }
//    }
//
//    public static void comprobarEdad(int edad) throws ExcepcionEmpleado {
//        if (String.valueOf(edad).length() > 3){
//            throw new ExcepcionEmpleado(ExcepcionEmpleado.WRONG_AGE_LENGTH);
//        }
//    }


}
