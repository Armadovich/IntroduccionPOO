package ComercialRepartidor;

public class Comercial extends Empleado{
    private double comision;

    public Comercial(String nombre, int edad, double salario, double comision) {
        super(nombre, edad, salario);
        this.comision = comision;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public String toString() {
        return super.toString()+"\nComisión: "+comision;
    }
    public double plus(){
        if (edad > 30 && comision > 200){
            return PLUS;
        }
        return 0;
    }
}
