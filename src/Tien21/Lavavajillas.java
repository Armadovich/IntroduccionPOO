package Tien21;

public class Lavavajillas extends Electrodomestico{
    private final int NUM_SERVICIOS_POR_DEFECTO = 12;
    private int numServicios;

    public Lavavajillas(int numServicios) {
        this.numServicios = NUM_SERVICIOS_POR_DEFECTO;
    }

    public Lavavajillas(double precioBase, double peso, int numServicios) {
        super(precioBase, peso);
        this.numServicios = NUM_SERVICIOS_POR_DEFECTO;
    }

    public Lavavajillas(double precioBase, String color, char consumoEnergetico, double peso, int numServicios) {
        super(precioBase, color, consumoEnergetico, peso);
        this.numServicios = numServicios;
    }

    public int getNumServicios() {
        return numServicios;
    }

    public void setNumServicios(int numServicios) {
        this.numServicios = numServicios;
    }

    public double precioFinal(){
        return (numServicios > 12) ? super.precioFinal() + 60 : super.precioFinal();
    }
}
