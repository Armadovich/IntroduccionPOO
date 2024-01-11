package Satelite;

public class Satelite {

    private double distanciaATierra;
    private double paralelo;
    private double meridiano;

    public Satelite(double distanciaATierra,  double paralelo, double meridiano) {
        this.distanciaATierra = distanciaATierra;
        this.paralelo = paralelo;
        this.meridiano = meridiano;
    }

    public void variaAltura(double desplazamiento){
        this.distanciaATierra += desplazamiento;
    }

    public boolean enOrbita(){
        return distanciaATierra != 0;
    }

    public void variaPosicion(double variap, double variam){
        this.paralelo += variap;
        this.meridiano += variam;
    }


}
