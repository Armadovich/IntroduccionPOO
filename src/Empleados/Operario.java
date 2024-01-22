package Empleados;

import java.time.LocalDate;

public class Operario extends Empleado{
    private String area;
    private String nave;

    public Operario(String nombre, double salario, LocalDate fechaIncorporacion, String area, String nave) {
        super(nombre, salario, fechaIncorporacion);
        this.area = area;
        this.nave = nave;
    }

    public Operario() {
        this.area = "";
        this.nave = "";
    }

    @Override
    public String toString() {
        return "Operario{" +
                "area='" + area + '\'' +
                ", nave='" + nave + '\'' +
                '}';
    }
}
