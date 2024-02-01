package Biblioteca;

public class Libro extends LibroRevista implements Prestable{

    private boolean prestado;

    public Libro(String codigo, String titulo, String anhoPublicacion) {
        super(codigo, titulo, anhoPublicacion);
        this.prestado = false;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public void prestar() {
        System.out.println("El libro ha sido prestado");
    }

    @Override
    public void devolver() {
        System.out.println("El libro ha sido devuelto");
    }

    @Override
    public String toString() {
        return (super.toString() + "\nPrestado: "+prestado);
    }
}
