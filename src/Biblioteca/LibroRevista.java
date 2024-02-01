package Biblioteca;

public class LibroRevista {
    protected String codigo;
    protected String titulo;
    protected String anhoPublicacion;

    public LibroRevista(String codigo, String titulo, String anhoPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anhoPublicacion = anhoPublicacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAnhoPublicacion() {
        return anhoPublicacion;
    }

    public void setAnhoPublicacion(String anhoPublicacion) {
        this.anhoPublicacion = anhoPublicacion;
    }

    public String toString() {
        return "El código es "+codigo+"\nEl titulo es "+titulo+"\nEl titulo es "+anhoPublicacion;
    }
}
