package Universidad;

public class Docente extends Persona{
    private String materia;

    public Docente(String nombre, int edad, String dni, char sexo, double peso, double altura, String materia) {
        super(nombre, edad, dni, sexo, peso, altura);
        this.materia = materia;
    }


    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Materia: " + materia);
    }
}
