package Almacen;

public class Bebida extends Producto{
    protected String envase;

    public Bebida(String identificador, String nombre, double precio, String marca, String localizacion, String envase) {
        super(identificador, nombre, precio, marca, localizacion);
        this.envase = envase;
    }

}
