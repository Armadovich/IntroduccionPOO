package Almacen;

import java.util.ArrayList;
import java.util.Objects;

public class AguaMineral extends Bebida{
    private String origen;
    private final double VA_CRISTAL = 0.1;
    private final double AGUARON_PLUS = 0.3;

    public AguaMineral(String identificador, String nombre, double precio, String marca, String localizacion, String envase, String origen) {
        super(identificador, nombre, precio, marca, localizacion, envase);
        this.origen = origen;
    }

    public double calcularPrecio(){
        double precioInicial = precio;
        if (Objects.equals(envase, "cristal")){
            precio += precioInicial * VA_CRISTAL;
        }
        if (Objects.equals(marca, "aguarón")){
            precio += precioInicial * AGUARON_PLUS;
        }
        return precio;
    }
}
