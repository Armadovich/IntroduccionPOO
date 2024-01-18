package Universidad;

public class Persona {
    private final char SEXO_POR_DEFECTO = 'M';
    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;

    public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
        this.nombre = nombre;
        if (edad >= 18) this.edad = edad;
        else{
            this.nombre = null;
            return;
        }

        this.dni = dni;
        if (sexo == 'M'|| sexo == 'F' || sexo =='f' || sexo =='m')this.sexo = sexo;
        else this.sexo = SEXO_POR_DEFECTO;
        this.peso = peso;
        this.altura = altura;
    }




    public void mostrarInfo(){
        System.out.println();
        System.out.println("--------------------------");
        System.out.println("Datos de la persona");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("DNI: " + dni);
        System.out.println("Sexo: " + sexo);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);

    }
}

