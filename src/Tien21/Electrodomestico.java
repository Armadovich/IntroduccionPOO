package Tien21;

public class Electrodomestico {
    private final String COLOR_POR_DEFECTO = "blanco";
    private final double PRECIO_POR_DEFECTO = 100;
    private final char CONSUMO_POR_DEFECTO = 'F';
    private final double PESO_POR_DEFECTO = 5;


    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private double peso;

    public Electrodomestico() {
        this.precioBase = PRECIO_POR_DEFECTO;
        this.color = COLOR_POR_DEFECTO;
        this.consumoEnergetico = CONSUMO_POR_DEFECTO;
        this.peso = PESO_POR_DEFECTO;
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = COLOR_POR_DEFECTO;
        this.consumoEnergetico = CONSUMO_POR_DEFECTO;

    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    private char comprobarConsumoEnergetico(char letra){
        if ((letra >= 'A' && letra <= 'F')||(letra >= 'a' && letra <= 'f')) return letra;
        else return CONSUMO_POR_DEFECTO;
    }
    private String comprobarColor(String color){
        String[] arrayColores = {"blanco","negro","rojo","azul","gris"};
        for (String arrayColore : arrayColores) {
            if (arrayColore.equalsIgnoreCase(color)) return color;
        }
        return COLOR_POR_DEFECTO;
    }
    public double precioFinal(){
        return switch (consumoEnergetico) {
            case 'a', 'A' -> precioBase + 100;
            case 'b', 'B' -> precioBase + 80;
            case 'c', 'C' -> precioBase + 60;
            case 'd', 'D' -> precioBase + 50;
            case 'e', 'E' -> precioBase + 30;
            case 'f', 'F' -> precioBase + 10;
            default -> precioBase;
        };
    }


    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
