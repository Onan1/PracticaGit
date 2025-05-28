public class DiseñadorFreelance extends Freelancer implements Facturable {
    private double pagoPorProyecto;

    public DiseñadorFreelance(String nombre, int id, int horasTrabajadas, double pagoPorProyecto) {
        super(nombre, id, horasTrabajadas);
        this.pagoPorProyecto = pagoPorProyecto;
    }

    @Override
    public double calcularPago() {
        return pagoPorProyecto;
    }

    @Override
    public void generarFactura() {
        System.out.println("Factura del Diseñador:");
        System.out.println("Total a pagar: $" + calcularPago());
    }
}
