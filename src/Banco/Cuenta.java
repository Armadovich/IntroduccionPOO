package Banco;

public class Cuenta {
    private Titular titular;
    private double cantidad;

    public Cuenta(Titular titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public Cuenta(Titular titular) {
        this.titular = titular;
        this.cantidad = 0;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void ingresar(double cantidad){
        if(cantidad>0) this.cantidad += cantidad;
    }

    public void retirar (double cantidad){
        if (this.cantidad - cantidad < 0){
            this.cantidad -= cantidad;
        }
    }
}
