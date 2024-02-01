package ComercialRepartidor;

public class Repartidor extends Empleado{
    private String zona;

    public Repartidor(String nombre, int edad, double salario, String zona) {
        super(nombre, edad, salario);
        this.zona = zona;
    }
    public String getZona() {
        return zona;
    }
    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        return super.toString()+"\nZona: "+zona;
    }
    public double plus(){
        if (edad < 25 && zona.equals("zona 3")){
            return PLUS;
        }
        return 0;
    }
}
