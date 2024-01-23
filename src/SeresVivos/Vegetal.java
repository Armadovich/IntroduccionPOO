package SeresVivos;

public class Vegetal extends SerVivo{
    private double altura;

    public Vegetal(String nombreCientifico, String nombreComun, double altura) {
        super(nombreCientifico, nombreComun);
        this.altura = altura;
    }

    @Override
    public void alimentacion() {
        System.out.println("Comen agua y sales minerales");
    }
}
