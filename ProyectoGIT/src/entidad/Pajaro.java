
package entidad;

public class Pajaro {
    public String nombre;
    public String habilidad;
    public String tamaño;
    public String color;

    public Pajaro() {
    }

    public Pajaro(String nombre, String habilidad, String tamaño, String color) {
        this.nombre = nombre;
        this.habilidad = habilidad;
        this.tamaño = tamaño;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public String getTamaño() {
        return tamaño;
    }

    public String getColor() {
        return color;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
