package Biblioteca;

public class Revista extends LibroRevista implements Prestable {

    private int numero;

    public Revista(String codigo, String titulo, String anhoPublicacion, int numero) {
        super(codigo, titulo, anhoPublicacion);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public void prestar() {
        System.out.println("La revista ha sido prestada");
    }

    @Override
    public void devolver() {
        System.out.println("La revista ha sido devuelta");
    }

    @Override
    public String toString() {
        return super.toString();
    }


}
