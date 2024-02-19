package Almacen;

public abstract class Producto {
    protected String identificador;
    protected String nombre;
    protected double precio;
    protected String marca;
    protected String localizacion;
    public Producto(String identificador, String nombre, double precio, String marca, String localizacion) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.localizacion = localizacion;
    }
    public Producto() {
        this.identificador = "";
        this.nombre = "";
        this.precio = 0;
        this.marca = "";
        this.localizacion = "";
    }
    public double calcularPrecio(){
        return precio;
    }

}
