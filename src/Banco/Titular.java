package Banco;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Titular {
    final
    char SEXO_POR_DEFECTO = 'H';
    final String CADENA_VACIA = "";
    final int DIAS_EN_18_ANIOS = 6570;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String dni;
    private char sexo;
    private String direccion;

    public Titular(String nombre, LocalDate fechaNacimiento, String dni, char sexo, String direccion) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
        this.sexo = sexo;
        this.direccion = direccion;
    }

    public Titular(String nombre, LocalDate fechaNacimiento, char sexo) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.dni = CADENA_VACIA;
        this.direccion = CADENA_VACIA;
    }

    public Titular() {
        this.nombre = CADENA_VACIA;
        this.fechaNacimiento = null;
        this.sexo = SEXO_POR_DEFECTO;
        this.dni = CADENA_VACIA;
        this.direccion = CADENA_VACIA;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean esMayorDeEdad(LocalDate fechaNacimiento){
        return (ChronoUnit.DAYS.between(fechaNacimiento,LocalDate.now()) > DIAS_EN_18_ANIOS);
    }
    public void comprobarSexo(char sexo){
        if (sexo == 'H'|| sexo =='M'){
            this.sexo = sexo;
        }
        else this.sexo = SEXO_POR_DEFECTO;
    }

}
