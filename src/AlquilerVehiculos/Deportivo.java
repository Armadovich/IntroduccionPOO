package AlquilerVehiculos;

public class Deportivo extends Vehiculo{
    private double cilindrada;

    public Deportivo(String matricula, String marca, String modelo, String color, double tarifa, double cilindrada) {
        super(matricula, marca, modelo, color, tarifa);
        this.cilindrada = cilindrada;
    }

    public Deportivo() {
        this.cilindrada = 0;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }
}
