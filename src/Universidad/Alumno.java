package Universidad;

public class Alumno extends Persona{
    private String escuela;
    private String grado;

    public Alumno(String nombre, int edad, String dni, char sexo, double peso, double altura, String escuela, String grado) {
        super(nombre, edad, dni, sexo, peso, altura);
        this.escuela = escuela;
        this.grado = grado;
    }


    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Escuela: " + escuela);
        System.out.println("Grado: " + grado);
    }
}
