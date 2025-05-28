import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Freelancer> freelancers = new ArrayList<>();

        freelancers.add(new ProgramadorFreelance("Carlos", 1, 40, 15.0));
        freelancers.add(new DiseñadorFreelance("Lucía", 2, 30, 500.0));
        freelancers.add(new RedactorFreelance("Miguel", 3, 20, 10, 12.0));

        double pagoTotal = 0;

        for (Freelancer f : freelancers) {
            f.mostrarInformacion();
            double pago = f.calcularPago();
            System.out.println("Pago calculado: $" + pago);
            if (f instanceof Facturable) {
                ((Facturable) f).generarFactura();
            }
            System.out.println("-----------------------------");
            pagoTotal += pago;
        }

        System.out.println("Pago total a todos los freelancers: $" + pagoTotal);
    }
}