package ec.edu.ups.clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ant76
 */
public class Cliente {
   
    private String nombre;
    private double saldo;
    private List<Libro> libros = new ArrayList<>();
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
    
    public void recargarCredito(double credito){
        saldo = saldo + credito;
    }
    public void comprarLibro(Libro l ){
        libros.add(l);
        saldo = saldo - l.getPrecio();
    }
}
