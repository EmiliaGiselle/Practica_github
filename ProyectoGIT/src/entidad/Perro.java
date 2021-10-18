/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author INTEL
 */
public class Perro {
    private String color;
    private String nombre;
    private String raza;
    
    

    public Perro() {
    }

    public Perro(String color, String nombre, String raza) {
        this.color = color;
        this.nombre = nombre;
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    
}
