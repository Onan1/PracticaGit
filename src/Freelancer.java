public abstract class Freelancer {
    protected String nombre;
    protected int id;
    protected int horasTrabajadas;

    public Freelancer(String nombre, int id, int horasTrabajadas) {
        this.nombre = nombre;
        this.id = id;
        this.horasTrabajadas = horasTrabajadas;
    }

    public abstract double calcularPago();

    public void mostrarInformacion() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Horas trabajadas: " + horasTrabajadas);
    }
}
