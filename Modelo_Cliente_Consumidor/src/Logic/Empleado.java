/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

public abstract class Empleado {
    protected double sueldoPorHora;
    protected final int horasTrabajadas; // Es final, ya que siempre será 24

    public Empleado(double sueldoPorHora) {
        this.sueldoPorHora = sueldoPorHora;
        this.horasTrabajadas = 24; // Asignamos 24 horas directamente
    }

    public double calcularSalario() {
        return sueldoPorHora * horasTrabajadas; // Calcula salarío basado en 24 horas
    }

    // Getters
    public double getSueldoPorHora() {
        return sueldoPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas; // Siempre devolverá 24
    }
}

