package pkg08.interfaces.y.excepciones;

public class Paypal implements Pago {

    @Override
    public void procesarPago(double monto
    ) {
        System.out.println("Pago con PayPal procesado. Monto: " + monto);
    }

    @Override
    public String toString() {
        return "PayPal: pago procesado correctamente";
    }
}
