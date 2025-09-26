package pkg05.uml.básico;

public class CuentaBancaria {

    private int cbu;
    private int saldo;
    private ClaveSeguridad clave;
    private Poseedor poseedor; 

    public CuentaBancaria(int cbu, int saldo, String codigoClave, String fechaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigoClave, fechaModificacion); 
    }

    public int getCbu() {
        return cbu;
    }

    public void setCbu(int cbu) {
        this.cbu = cbu;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public ClaveSeguridad getClave() {
        return clave;
    }

    public void setClave(ClaveSeguridad clave) {
        this.clave = clave;
    }

    public Poseedor getPoseedor() {
        return poseedor;
    }

    public void setPoseedor(Poseedor poseedor) {
        this.poseedor = poseedor;
        if (poseedor.getCuenta() != this) {
            poseedor.setCuenta(this); 
        }
    }

    @Override
    public String toString() {
        return "CuentaBancaria cbu = " + cbu + ", saldo = " + saldo + ", clave = [" + clave + "], poseedor = " + (poseedor != null ? poseedor.getNombre() : "Sin poseedor");
    }
}
