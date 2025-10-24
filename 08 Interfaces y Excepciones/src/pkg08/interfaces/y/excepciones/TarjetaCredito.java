package pkg08.interfaces.y.excepciones;

public class TarjetaCredito implements PagoConDescuento {

    private double descuento;

    public TarjetaCredito(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public double aplicarDescuento(double monto) {
        return monto - (monto * descuento / 100);
    }

    @Override
    public void procesarPago(double monto) {
        double finalMonto = aplicarDescuento(monto);
        System.out.println("Pago con Tarjeta de Credito procesado. Monto final: " + finalMonto);
    }

    @Override
    public String toString() {
        return "TarjetaCredito: descuento=" + descuento;
    }

}
