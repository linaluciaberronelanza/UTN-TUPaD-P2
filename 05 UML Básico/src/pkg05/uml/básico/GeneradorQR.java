package pkg05.uml.básico;

public class GeneradorQR {

    public void generar(String valor, Programador programador) { 
        CodigoQR qr = new CodigoQR(valor, programador); 
        System.out.println("Generador ha creado el QR: " + qr.getValor());
    }
}
