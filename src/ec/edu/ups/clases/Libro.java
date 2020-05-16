package ec.edu.ups.clases;

/**
 *
 * @author Hernan Morocho
 */
public abstract class Libro {

    private String titulo;
    private String autor;
    private String edicion;
    private double precio;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void calcularPrecio() {
        double nuevoPre = this.getPrecio() + calcularBase() + calcularEnvio();
        this.setPrecio(nuevoPre);

    }
    public abstract double calcularBase();
    public abstract double calcularEnvio();

}
