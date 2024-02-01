package Legislacion;

public abstract class Legislador extends Persona{
    private String provinciaRepresentada;
    protected String camara;
    private boolean esNacional;
    private int anhosResidencia;

    public Legislador(String dni, String nombre, String apellido1, String apellido2, int edad, String provinciaRepresentada, String camara, boolean esNacional, int anhosResidencia) {
        super(dni, nombre, apellido1, apellido2, edad);
        this.provinciaRepresentada = provinciaRepresentada;
        this.camara = camara;
        this.esNacional = esNacional;
        this.anhosResidencia = anhosResidencia;
    }
    public abstract String getCamaraEnQueTrabaja();
}
