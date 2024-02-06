package Colecciones.Ej4;

public class Alumno {
    private String dni;
    private String nombre;
    private int edad;
    private String direccion;

    public Alumno(String dni, String nombre, int edad, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "DNI: "+dni+"\nNombre: "+nombre+"\nEdad: "+edad+"\nDirección: "+direccion;
    }
}
