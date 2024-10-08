/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

public abstract class Empleado {
    protected String nombre;
    protected double sueldoPorHora;
    protected int horasTrabajadas;

    public Empleado(String nombre, double sueldoPorHora) {
        this.nombre = nombre;
        this.sueldoPorHora = sueldoPorHora;
        this.horasTrabajadas = 0;
    }

    public double calcularSalario() {
        return sueldoPorHora * horasTrabajadas;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setHorasTrabajadas(int horas) {
        this.horasTrabajadas += horas;
    }
}

