package pkg05.uml.básico;

public class Reserva {

    private String fecha;
    private String hora;
    private Comensal comensal; 
    private Mesa mesa;  

    public Reserva(String fecha, String hora, Comensal comensal, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.comensal = comensal;
        this.mesa = mesa;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Comensal getComensal() {
        return comensal;
    }

    public void setComensal(Comensal comensal) {
        this.comensal = comensal;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    @Override
    public String toString() {
        return "Reserva fecha = " + fecha + ", hora = " + hora + ", comensal = " + comensal + ", mesa " + mesa;
    }
}
