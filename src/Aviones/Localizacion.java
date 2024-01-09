package Aviones;

public class Localizacion {
    private String ciudad;
    private String direccion;
    private String coordenadas;

    public Localizacion(String ciudad, String direccion, String coordenadas) {
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.coordenadas = coordenadas;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(String coordenadas) {
        this.coordenadas = coordenadas;
    }
}
