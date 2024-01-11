package Pesaje;

public class Peso {
    private double pesoKg;

    public Peso(double peso, String medida) {
        switch (medida){
            case "Lb":
                pesoKg = peso * 0.453;
                break;
            case "Li":
                pesoKg = peso * 14.59;
                break;
            case "Oz":
                pesoKg = peso * 0.02835;
                break;
            case "p":
                pesoKg = peso * 0.00155;
                break;
            case "K":
                pesoKg = peso;
                break;
            case "G":
                pesoKg = peso * 0.001;
                break;
            case "Q":
                pesoKg = peso * 43.3;
                break;
            default:
                System.out.println("Medida incorrecta");
        }
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    public double getLibras(){
        return pesoKg / 0.453;
    }

    public double getLingotes(){
        return pesoKg / 14.59;
    }

    public double getPeso(String medida){
        return switch (medida) {
            case "Lb" -> pesoKg / 0.453;
            case "Li" -> pesoKg / 14.59;
            case "Oz" -> pesoKg / 0.02835;
            case "p" -> pesoKg / 0.00155;
            case "K" -> pesoKg;
            case "G" -> pesoKg / 0.001;
            case "Q" -> pesoKg / 43.3;
            default -> {
                System.out.println("Medida incorrecta");
                yield 0;
            }
        };
    }
}
