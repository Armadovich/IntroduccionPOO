package Aviones;

public abstract class Aeronave {

    private String id;
    private int numPasajeros;
    private double maxAutonomia;
    private String modelo;

    public Aeronave(String id, int numPasajeros, double maxAutonomia, String modelo) {
        this.id = id;
        this.numPasajeros = numPasajeros;
        this.maxAutonomia = maxAutonomia;
        this.modelo = modelo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public double getMaxAutonomia() {
        return maxAutonomia;
    }

    public void setMaxAutonomia(double maxAutonomia) {
        this.maxAutonomia = maxAutonomia;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
