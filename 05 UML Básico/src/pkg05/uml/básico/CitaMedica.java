package pkg05.uml.básico;

public class CitaMedica {

    private String fecha;
    private String hora;
    private Paciente paciente;  
    private Doctor doctor;  

    public CitaMedica(String fecha, String hora, Paciente paciente, Doctor doctor) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.doctor = doctor;
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

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return "CitaMedica fecha = " + fecha + ", hora = " + hora + ", paciente = " + (paciente != null ? paciente.getNombre() : "Sin paciente") + ", doctor = " + (doctor != null ? doctor.getNombre() : "Sin doctor");
    }
}
