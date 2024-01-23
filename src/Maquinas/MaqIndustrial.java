package Maquinas;

public class MaqIndustrial extends Maquina{
    private int potenciaConsumo;

    public MaqIndustrial(int numeroDeSerie, String modelo, int horasFuncionamiento, int potenciaConsumo) {
        super(numeroDeSerie, modelo, horasFuncionamiento);
        this.potenciaConsumo = potenciaConsumo;
    }

    public int getPotenciaConsumo() {
        return potenciaConsumo;
    }

    public void setPotenciaConsumo(int potenciaConsumo) {
        this.potenciaConsumo = potenciaConsumo;
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo Maquina Industrial");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando Maquina Industrial");
    }
}
