package Finanzas;

public class Finanzas {
    final double CONVERSION_DOLAR_EURO = 1.36;

    private double dolarEuro;

    public Finanzas(double dolarEuro) {
        this.dolarEuro = dolarEuro;
    }

    public Finanzas() {
        this.dolarEuro = CONVERSION_DOLAR_EURO;
    }

    public double dolaresToEuros(double dolar){
        return dolar * dolarEuro;
    }

    public double eurosToDolares(double euro){
        return euro / dolarEuro;
    }
}