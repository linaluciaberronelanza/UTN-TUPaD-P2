
package pkg05.uml.básico;

public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente;
    private Banco banco; 

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }

    public String getNumero() {
        return numero;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public Banco getBanco() {
        return banco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        // Mantenemos la relación bidireccional
        if (cliente.getTarjeta() != this) {
            cliente.setTarjeta(this);
        }
    }

    @Override
    public String toString() {
        return "Tarjeta De Credito numero = " + numero + ", fecha de vencimiento = " + fechaVencimiento + banco;
    }
}
