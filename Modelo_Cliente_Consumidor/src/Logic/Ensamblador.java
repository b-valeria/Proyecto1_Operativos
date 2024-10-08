/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

public class Ensamblador extends Empleado {
    private int tiempoEnsamblaje; // en días

    public Ensamblador(String nombre, double sueldoPorHora, int tiempoEnsamblaje) {
        super(nombre, sueldoPorHora);
        this.tiempoEnsamblaje = tiempoEnsamblaje;
    }

    public void ensamblarComputadora() {
        // Lógica para ensamblar una computadora
    }

    // Getters y Setters
    public int getTiempoEnsamblaje() {
        return tiempoEnsamblaje;
    }
}

