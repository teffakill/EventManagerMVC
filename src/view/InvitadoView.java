// Mejora 2: optimización del modelo Invitado
package model;

public class Invitado {
    private String nombre;

    public Invitado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}