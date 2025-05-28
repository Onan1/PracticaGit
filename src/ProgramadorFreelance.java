public class ProgramadorFreelance {
    public class ProgramadorFreelance extends Freelancer implements Facturable {
        private double tarifaPorHora;

        public ProgramadorFreelance(String nombre, int id, int horasTrabajadas, double tarifaPorHora) {
            super(nombre, id, horasTrabajadas);
            this.tarifaPorHora = tarifaPorHora;
        }

        @Override
        public double calcularPago() {
            return horasTrabajadas * tarifaPorHora;
        }

        @Override
        public void generarFactura() {
            System.out.println("Factura del Programador:");
            System.out.println("Total a pagar: $" + calcularPago());
        }
    }
}
