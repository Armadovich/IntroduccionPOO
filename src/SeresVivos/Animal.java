package SeresVivos;

public class Animal extends SerVivo{
    private double peso;
    private double altura;

    public Animal(String nombreCientifico, String nombreComun, double peso, double altura) {
        super(nombreCientifico, nombreComun);
        this.peso = peso;
        this.altura = altura;
    }

    @Override
    public void alimentacion() {
        System.out.println("Herbivoros, carnivoros o omnivoros");
    }
}
