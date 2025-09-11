
package introduccion.a.poo;

public class Mascotas {
    
    private String nombre;
    private String especie;
    private int edad;
    
    public void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        }
    }
    
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double cumplirAnios(int anios) {
        if (anios > 0) {
            edad += anios;
        }
        return edad;
    }
    
     public void getMostrarInfo() {
        System.out.println("El nombre de la mascota es: " + nombre + ", y es un : " + especie + ".Tiene " + edad + "años");
    }
    
}
