import java.util.Scanner;

public class MainGestionCine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SalaCine sala = new SalaCine();

        System.out.print("Introduce la pelicula: ");
        String titulo = sc.nextLine();

        System.out.print("Precio Base: ");
        double precioBase = sc.nextDouble();
        sc.nextLine();

        System.out.print("Horario (mañana/tarde): ");
        String horario = sc.nextLine();

        System.out.print("Tipo (1-Clasico / 2-3D)");
        int tipo = sc.nextInt();

        System.out.println("Añade el recargo");
        double recargo = sc.nextDouble();

        sc.nextLine();
        Proyeccion proyeccion;

        if (tipo == 1) {
            proyeccion = new ProyeccionClasico(titulo, precioBase, horario);
        } else {
            proyeccion = new Proyeccion3D(titulo, precioBase, horario, recargo);
        }
        sala.mostrarAsientos();

        System.out.println("\n ======Seleccione asiento (1-50): ");
        int Asiento = sc.nextInt();

        try {
            sala.reservarAsientos(Asiento);
            System.out.println("\nReserva confirmada");
            System.out.println("Película: " + proyeccion.getTitulo());
            System.out.println("Horario: " + proyeccion.getHorario());
            System.out.println("Precio final: " + proyeccion.CalcularPrecio() + " €");
        } catch (AsientoNoDisponibleException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
