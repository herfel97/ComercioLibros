package ec.edu.ups.clases;

/**
 *
 * @author Hernan Morocho
 */
public class LibroImpreso extends Libro {

    @Override
    public double calcularEnvio() {
        return 20.00;
    }

    @Override
    public double calcularBase() {
        int comision = 2;
        double pre = this.getPrecio();
        double com = (pre * comision) / 100;
        return com;
    }

}
