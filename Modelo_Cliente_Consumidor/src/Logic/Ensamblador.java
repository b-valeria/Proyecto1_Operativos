/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

public class Ensamblador extends Empleado {
    private int tiempoEnsamblaje;

    public Ensamblador(double sueldoPorHora, int tiempoEnsamblaje) {
        super(sueldoPorHora);
        this.tiempoEnsamblaje = tiempoEnsamblaje;
    }

    public void ensamblarComputadora() {
        // Implementación del método ensamblarComputadora
        System.out.println("Ensamblando computadora en " + tiempoEnsamblaje + " horas.");
    }

    // Getters y Setters
    public int getTiempoEnsamblaje() {
        return tiempoEnsamblaje;
    }

    public void setTiempoEnsamblaje(int tiempoEnsamblaje) {
        this.tiempoEnsamblaje = tiempoEnsamblaje;
    }
}


