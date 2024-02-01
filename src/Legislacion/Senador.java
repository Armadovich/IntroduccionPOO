package Legislacion;

public class Senador extends Legislador{
    public Senador(String dni, String nombre, String apellido1, String apellido2, int edad, String provinciaRepresentada, String camara, boolean esNacional, int anhosResidencia) {
        super(dni, nombre, apellido1, apellido2, edad, provinciaRepresentada, camara, esNacional, anhosResidencia);
    }

    @Override
    public String getCamaraEnQueTrabaja() {
        return camara;
    }
}
