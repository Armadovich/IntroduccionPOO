package Aviones;

public class AvionTurbinas extends Aeronave {

    private int numTurbinas;
    private String modeloMotores;

    public AvionTurbinas(String id, int numPasajeros, double maxAutonomia, String modelo, int numTurbinas, String modeloMotores) {
        super(id, numPasajeros, maxAutonomia, modelo);
        this.numTurbinas = numTurbinas;
        this.modeloMotores = modeloMotores;
    }

    public int getNumTurbinas() {
        return numTurbinas;
    }

    public void setNumTurbinas(int numTurbinas) {
        this.numTurbinas = numTurbinas;
    }

    public String getModeloMotores() {
        return modeloMotores;
    }

    public void setModeloMotores(String modeloMotores) {
        this.modeloMotores = modeloMotores;
    }
}
