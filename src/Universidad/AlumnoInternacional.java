package Universidad;

public class AlumnoInternacional extends Alumno{
    private String paisProcedencia;

    public AlumnoInternacional(String nombre, int edad, String dni, char sexo, double peso, double altura, String escuela, String grado, String paisProcedencia) {
        super(nombre, edad, dni, sexo, peso, altura, escuela, grado);
        this.paisProcedencia = paisProcedencia;
    }


    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("País de procedencia: " + paisProcedencia);
    }

}
