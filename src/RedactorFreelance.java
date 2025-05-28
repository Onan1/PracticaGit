public class RedactorFreelance extends Freelancer implements Facturable {
    private int articulos;
    private double pagoPorArticulo;

    public RedactorFreelance(String nombre, int id, int horasTrabajadas, int articulos, double pagoPorArticulo) {
        super(nombre, id, horasTrabajadas);
        this.articulos = articulos;
        this.pagoPorArticulo = pagoPorArticulo;
    }

    @Override
    public double calcularPago() {
        return articulos * pagoPorArticulo;
    }

    @Override
    public void generarFactura() {
        System.out.println("Factura del Redactor:");
        System.out.println("Total a pagar: $" + calcularPago());
    }
}
