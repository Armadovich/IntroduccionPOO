package Tien21;

public class Television extends Electrodomestico {
    private final double RESOLUCION_POR_DEFECTO = 32;
    private final boolean SINTONIZADOR_POR_DEFECTO = false;
    private double resolucion;
    private boolean sintonizadorTDT;

    public Television() {
        this.resolucion = RESOLUCION_POR_DEFECTO;
        this.sintonizadorTDT = SINTONIZADOR_POR_DEFECTO;
    }

    public Television(double precioBase, double peso) {
        super(precioBase, peso);
        this.resolucion = RESOLUCION_POR_DEFECTO;
        this.sintonizadorTDT = SINTONIZADOR_POR_DEFECTO;
    }

    public Television(double precioBase, String color, char consumoEnergetico, double peso, double resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public double precioFinal(){
        double precioFinal = super.precioFinal();
        precioFinal *= (resolucion > 40) ? 1.3 : 1;
        precioFinal += (sintonizadorTDT) ? 50 : 0;
        return precioFinal;
    }
}
