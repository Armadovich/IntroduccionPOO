package Maquinas;

public class MaqDomestica extends Maquina{

    public MaqDomestica(int numeroDeSerie, String modelo, int horasFuncionamiento) {
        super(numeroDeSerie, modelo, horasFuncionamiento);
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo Maquina Domestica");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando Maquina Domestica");
    }
}
