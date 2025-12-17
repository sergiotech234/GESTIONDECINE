public class Proyeccion3D extends Proyeccion {
    private double recargo;

    public Proyeccion3D(String titulo, double precio, String horario, double recargo) {
        super(titulo, precio, horario);
        this.recargo = recargo;
    }

    @Override
    public double CalcularPrecio(){
        return precioBase + recargo;
    }
}
