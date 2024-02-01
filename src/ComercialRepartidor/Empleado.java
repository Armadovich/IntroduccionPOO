package ComercialRepartidor;

public abstract class Empleado {
    protected String nombre;
    protected int edad;
    protected double salario;
    final double PLUS = 300;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public double getPLUS() {
        return PLUS;
    }
    public String toString(){
        return "Nombre: "+nombre+"\nEdad: "+edad+"\nSalario: "+salario;
    }
    public double plus(){
        return PLUS;
    }
}
