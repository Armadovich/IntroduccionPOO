package Maquinas;

public abstract class Maquina {
    private int numeroDeSerie;
    private String modelo;
    private int horasFuncionamiento;

    public Maquina(int numeroDeSerie, String modelo, int horasFuncionamiento) {
        this.numeroDeSerie = numeroDeSerie;
        this.modelo = modelo;
        this.horasFuncionamiento = horasFuncionamiento;
    }

    public Maquina() {
        this.numeroDeSerie = 0;
        this.modelo = "";
        this.horasFuncionamiento = 0;
    }

    public int getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(int numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getHorasFuncionamiento() {
        return horasFuncionamiento;
    }

    public void setHorasFuncionamiento(int horasFuncionamiento) {
        this.horasFuncionamiento = horasFuncionamiento;
    }

    public abstract void encendido();
    public abstract void apagado();
}
