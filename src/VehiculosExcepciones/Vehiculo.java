package VehiculosExcepciones;


import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vehiculo {
    private String color;
    private String modelo;
    private String matricula;
    private int anhoFabricacion;


    public Vehiculo(String color, String modelo, String matricula, int anhoFabricacion) throws ExcepcionVehiculo {
        this.color = comprobarColor(color);
        this.modelo = modelo;
        this.matricula = comprobarMatricula(matricula);
        this.anhoFabricacion = anhoFabricacion;
    }

    private String comprobarMatricula(String matricula) throws ExcepcionVehiculo {

        Pattern pat = Pattern.compile("^[0-9]{4}(?!.*(LL|CH))[BCDFGHJKLMNPRSTVWXYZ]{3}");
        Matcher mat = pat.matcher(matricula);

        if (!mat.matches()) throw new ExcepcionVehiculo(1);
        return matricula;
    }
    private String comprobarColor(String color) throws ExcepcionVehiculo {
        ArrayList<String> colores = new ArrayList<>();
        colores.add("rojo");
        colores.add("azul");
        colores.add("blanco");
        colores.add("gris");
        colores.add("negro");

        if (!colores.contains(color)) throw new ExcepcionVehiculo(2);
        return color;
    }
}
