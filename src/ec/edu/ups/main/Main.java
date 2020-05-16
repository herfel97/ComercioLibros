package ec.edu.ups.main;

import ec.edu.ups.clases.Cliente;
import ec.edu.ups.clases.Libro;
import ec.edu.ups.clases.LibroDigital;
import ec.edu.ups.clases.LibroImpreso;
import java.util.Scanner;

/**
 *
 * @author ant76
 */
public class Main {

    public static void main(String args[]) {
        Cliente c1 = new Cliente();
        c1.setNombre("NELSON SANCHEZ");
        c1.setSaldo(140.50);

        Libro libD1 = new LibroDigital();
        libD1.setAutor("HG Wells");
        libD1.setEdicion("1950");
        libD1.setTitulo("LA GUERRA DE LOS MUNDOS");
        libD1.setPrecio(100.00);
        libD1.calcularPrecio();

        Libro libD2 = new LibroDigital();
        libD2.setAutor("NEMIROVSKY IRENE");
        libD2.setEdicion("1985");
        libD2.setTitulo("EL MAESTRO DE ALMAS");
        libD2.setPrecio(13.50);
        libD2.calcularPrecio();

        Libro libD3 = new LibroDigital();
        libD3.setAutor("WILLIAMS JHONS");
        libD3.setEdicion("2006");
        libD3.setTitulo("STONER");
        libD3.setPrecio(20.00);
        libD3.calcularPrecio();

        Libro libD4 = new LibroDigital();
        libD4.setAutor("ARRIAGA GUILLERMO");
        libD4.setEdicion("2008");
        libD4.setTitulo("SALVAR EL FUEGO");
        libD4.setPrecio(35.69);
        libD4.calcularPrecio();

        Libro lib1 = new LibroImpreso();
        lib1.setAutor("JARED STEDMAN JONES ");
        lib1.setEdicion("1996");
        lib1.setTitulo("LOA A LA TIERRA");
        lib1.setPrecio(19.10);
        lib1.calcularPrecio();

        Libro lib2 = new LibroImpreso();
        lib2.setAutor("BENEDICT MARIE");
        lib2.setEdicion("1966");
        lib2.setTitulo("EL OTRO EINSTEIN");
        lib2.setPrecio(28.50);
        lib2.calcularPrecio();

        Libro lib3 = new LibroImpreso();
        lib3.setAutor("SALVAT MARTA");
        lib3.setEdicion("1978");
        lib3.setTitulo("DECIDE DE NUEVO");
        lib3.setPrecio(50.00);
        lib3.calcularPrecio();

        Libro lib4 = new LibroImpreso();
        lib4.setAutor("RK ROWLING");
        lib4.setEdicion("1886");
        lib4.setTitulo("HARRY POTTER Y EL PRISIONERO DE ASKABAN");
        lib4.setPrecio(100.00);
        lib4.calcularPrecio();

        Scanner sc = new Scanner(System.in);
        int opc = 0;
        String opcionLibro;
        do {
            System.out.println("----- Comercio Electronico -----");
            System.out.println(" CLIENTE: " + c1.getNombre());
            System.out.println(" SALDO ACTUAL: $" + c1.getSaldo());
            System.out.println("********************************");
            System.out.println("1)Recargar Saldo");
            System.out.println("2)Comprar Libros");
            System.out.println("3)Lista de libros");
            System.out.println("4)Salir");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Ingrese valor a recargar: ");
                    double rec = sc.nextDouble();
                    c1.recargarCredito(rec);
                    System.out.println("Se ha recargado $" + rec + " a su cuenta.");
                case 2:
                    System.out.println("\n--------------------------------------");
                    System.out.println("LIBROS DISPONIBLES");
                    System.out.println("1. Digitales");
                    System.out.println("\ta. " + libD1.getTitulo() + " $" + libD1.getPrecio());
                    System.out.println("\tb. " + libD2.getTitulo() + " $" + libD2.getPrecio());
                    System.out.println("\tc. " + libD3.getTitulo() + " $" + libD3.getPrecio());
                    System.out.println("\td. " + libD4.getTitulo() + " $" + libD4.getPrecio());
                    System.out.println("2. Impresos");
                    System.out.println("\te. " + lib1.getTitulo() + " $" + lib1.getPrecio());
                    System.out.println("\tf. " + lib2.getTitulo() + " $" + lib2.getPrecio());
                    System.out.println("\tg. " + lib3.getTitulo() + " $" + lib3.getPrecio());
                    System.out.println("\th. " + lib4.getTitulo() + " $" + lib4.getPrecio());
                    System.out.println("3. Salir");
                    System.out.println("\ti. Salir de la compra");
                    System.out.println("--------------------------------------");
                    System.out.println("");

                    do {
                        opcionLibro = sc.nextLine();
                        switch (opcionLibro) {
                            case "a":
                                if (c1.getSaldo() > libD1.getPrecio()) {
                                    c1.comprarLibro(libD1);
                                } else {
                                    System.out.println("No tiene suficiente credito");
                                }
                                break;
                            case "b":
                                if (c1.getSaldo() > libD2.getPrecio()) {
                                    c1.comprarLibro(libD2);
                                } else {
                                    System.out.println("No tiene suficiente credito");
                                }
                                break;
                            case "c":
                                if (c1.getSaldo() > libD3.getPrecio()) {
                                    c1.comprarLibro(libD3);
                                } else {
                                    System.out.println("No tiene suficiente credito");
                                }
                                break;
                            case "d":
                                if (c1.getSaldo() > libD4.getPrecio()) {
                                    c1.comprarLibro(libD4);
                                } else {
                                    System.out.println("No tiene suficiente credito");
                                }
                                break;
                            case "e":
                                if (c1.getSaldo() > lib1.getPrecio()) {
                                    c1.comprarLibro(lib1);
                                } else {
                                    System.out.println("No tiene suficiente credito");
                                }
                                break;
                            case "f":
                                if (c1.getSaldo() > lib2.getPrecio()) {
                                    c1.comprarLibro(lib2);
                                } else {
                                    System.out.println("No tiene suficiente credito");
                                }
                                break;
                            case "g":
                                if (c1.getSaldo() > lib3.getPrecio()) {
                                    c1.comprarLibro(lib3);
                                } else {
                                    System.out.println("No tiene suficiente credito");
                                }
                                break;
                            case "h":
                                if (c1.getSaldo() > lib4.getPrecio()) {
                                    c1.comprarLibro(lib4);
                                } else {
                                    System.out.println("No tiene suficiente credito");
                                }
                                break;
                        }
                        System.out.print("Ingrese una LETRA: ");
                    } while (!opcionLibro.equals("i"));
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("**** LIBROS COMPRADOS ****");
                    if (c1.getLibros().isEmpty()) {
                        System.out.println("El cliente no tiene libros comprados");
                    } else {
                        for (Libro l : c1.getLibros()) {
                            System.out.println("Libro: " + l.getTitulo() +" $"+l.getPrecio());
                        }
                    }
            }
            System.out.println("*****************");

        } while (opc != 4);

    }
}
