package Coche;

public class Consumo {

    private double kms;
    private double litros;
    private double vmed;
    private double pgas;

    public Consumo(double kms, double litros, double vmed, double pgas) {
        this.kms = kms;
        this.litros = litros;
        this.vmed = vmed;
        this.pgas = pgas;
    }

    public double getKms() {
        return kms;
    }

    public void setKms(double kms) {
        this.kms = kms;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public double getVmed() {
        return vmed;
    }

    public void setVmed(double vmed) {
        this.vmed = vmed;
    }

    public double getPgas() {
        return pgas;
    }

    public void setPgas(double pgas) {
        this.pgas = pgas;
    }

    public double getTiempo(){
        return this.kms/this.vmed;
    }

    public double consumoMedio(){
        return (this.litros * 100)/this.kms;
    }

    public double consumoEuros(){
        return (this.pgas * this.consumoMedio());
    }
}