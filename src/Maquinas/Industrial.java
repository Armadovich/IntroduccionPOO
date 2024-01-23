package Maquinas;

public class Industrial extends Maquina{
    private int potenciaConsumo;

    public Industrial(int numeroDeSerie, String modelo, int horasFuncionamiento, int potenciaConsumo) {
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
    public void encendido() {

    }

    @Override
    public void apagado() {

    }
}
