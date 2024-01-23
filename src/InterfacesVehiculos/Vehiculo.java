package InterfacesVehiculos;

public interface Vehiculo {
    int VELOCIDAD_MAXIMA = 120;
    int VELOCIDAD_MINIMA = 0;
    String acelerar(int velocidadAdicional);
    String frenar(int velocidadAdicional);

}
