public class ProyeccionClasico extends Proyeccion{

    public ProyeccionClasico(String titulo, double precio, String horario) {
        super(titulo, precio, horario);
    }

    @Override
    public double CalcularPrecio() {
        return precioBase;
    }
}
