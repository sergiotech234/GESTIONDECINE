public abstract class Proyeccion {
    protected String titulo;
    protected double precioBase;
    protected String horario;

    public Proyeccion(String titulo, double precioBase, String horario) {
        this.titulo = titulo;
        this.precioBase = precioBase;
        this.horario = horario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public abstract double CalcularPrecio();
}
