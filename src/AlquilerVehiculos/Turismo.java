package AlquilerVehiculos;

public class Turismo extends Vehiculo{
    private int numeroPuertas;
    private boolean automatico;

    public Turismo(String matricula, String marca, String modelo, String color, double tarifa, int numeroPuertas, boolean automatico) {
        super(matricula, marca, modelo, color, tarifa);
        this.numeroPuertas = numeroPuertas;
        this.automatico = automatico;
    }

    public Turismo() {
        this.numeroPuertas = 0;
        this.automatico = false;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public boolean isAutomatico() {
        return automatico;
    }

    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }
}
