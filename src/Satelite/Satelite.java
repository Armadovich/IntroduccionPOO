package Satelite;

public class Satelite {

    private double distanciaATierra;
    private boolean enOrbita;
    private double paralelo;
    private double meridiano;

    public Satelite(double distanciaATierra, boolean enOrbita, double paralelo, double meridiano) {
        this.distanciaATierra = distanciaATierra;
        this.enOrbita = enOrbita;
        this.paralelo = paralelo;
        this.meridiano = meridiano;
    }

    public void variaAltura(double desplazamiento){
        this.distanciaATierra += desplazamiento;
    }

    public boolean enOrbita(){
        return this.enOrbita;
    }

    public void variaPosicion(double variap, double variam){
        this.paralelo += variap;
        this.meridiano += variam;
    }


}
