package Almacen;

import java.util.Objects;

public class Refrescos extends Bebida{
    private double porcentajeAzucar;
    private boolean promocion;
    private final double DESCUENTO_PROMOCION = 0.15;
    private final double DESCUENTO_LATA = 0.5;
    private final double VA_AZUCAR = 0.1;

    public Refrescos(String identificador, String nombre, double precio, String marca, String localizacion, String envase, double porcentajeAzucar, boolean promocion) {
        super(identificador, nombre, precio, marca, localizacion, envase);
        this.porcentajeAzucar = porcentajeAzucar;
        this.promocion = promocion;
    }

    public double calcularPrecio(){
        double precioInicial = precio;
        if (Objects.equals(envase, "lata")){
            precio -= precioInicial * DESCUENTO_LATA;
        }
        if (porcentajeAzucar > 0.1){
            precio += precioInicial * VA_AZUCAR;
        }
        if (promocion){
            precio -= precioInicial * DESCUENTO_PROMOCION;
        }
        return precio;
    }
}
