package InterfacesVehiculos;

public class Turismo implements Vehiculo{
    private int velocidad;

    public Turismo(int velocidad) {
        if (velocidad < VELOCIDAD_MINIMA){
            this.velocidad = VELOCIDAD_MINIMA;
        } else if (velocidad >VELOCIDAD_MAXIMA) {
            this.velocidad = VELOCIDAD_MAXIMA;
        }else this.velocidad = velocidad;
    }


    @Override
    public String acelerar(int velocidadAdicional) {
        velocidad += velocidadAdicional;
        if (velocidad > VELOCIDAD_MAXIMA) velocidad = VELOCIDAD_MAXIMA;
        return ""+velocidad;
    }

    @Override
    public String frenar(int velocidadAdicional) {
        velocidad -= velocidadAdicional;
        if(velocidad < VELOCIDAD_MINIMA) velocidad = VELOCIDAD_MINIMA;
        return ""+velocidad;
    }
}
