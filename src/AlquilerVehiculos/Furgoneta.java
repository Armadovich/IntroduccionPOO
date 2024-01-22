package AlquilerVehiculos;

public class Furgoneta extends Vehiculo{
    private double carga;
    private double volumen;

    public Furgoneta(String matricula, String marca, String modelo, String color, double tarifa, double carga, double volumen) {
        super(matricula, marca, modelo, color, tarifa);
        this.carga = carga;
        this.volumen = volumen;
    }

    public Furgoneta() {
        this.carga = 0;
        this.volumen = 0;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }
}
