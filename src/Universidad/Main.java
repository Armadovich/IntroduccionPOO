package Universidad;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Persona[] test = new Persona[7];

        test[0] = new Docente("Arturo", 45, "43590303F", 'H', 78, 1.78, "Derecho Romano");
        test[1] = new Alumno("Julian", 16, "98233483S", 'N', 73, 1.66, "Biologia Marina", "Biologia Marina");
        test[2] = new AlumnoInternacional("Sarah", 22, "98765432W", 'M', 56, 1.81, "Derecho", "Derecho", "Gales");
        test[3] = new Docente("Paco", 12,"5468454G", 's',78,1.64,"materia");
        test[4] = new Docente("Paco",100,"12312412G",'O',87,1.89,"materia");
        test[5] = new Alumno("Ataulfo", 18,"74878641535F",'G',75,1.85,"teis","DAW");
        test[6] = new AlumnoInternacional("Paquito", 23,"5456454F",'H',98,1.95,"teis","DAW", "Mauritania");


        Arrays.stream(test).forEach(Persona::mostrarInfo);
    }
}
