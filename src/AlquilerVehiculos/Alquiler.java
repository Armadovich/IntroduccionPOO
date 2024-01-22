package AlquilerVehiculos;

import java.time.LocalDate;

public class Alquiler {
    private Cliente cliente;
    private Vehiculo vehiculo;
    private LocalDate fecha;
    private int diasAlquiler;

    public Alquiler(Cliente cliente, Vehiculo vehiculo, LocalDate fecha, int diasAlquiler) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fecha = fecha;
        this.diasAlquiler = diasAlquiler;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getDiasAlquiler() {
        return diasAlquiler;
    }

    public void setDiasAlquiler(int diasAlquiler) {
        this.diasAlquiler = diasAlquiler;
    }
}
