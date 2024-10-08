/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

public class Productor extends Empleado {
    private String tipoProducto;
    private int capacidadAlmacen;

    public Productor(String nombre, double sueldoPorHora, String tipoProducto, int capacidadAlmacen) {
        super(nombre, sueldoPorHora);
        this.tipoProducto = tipoProducto;
        this.capacidadAlmacen = capacidadAlmacen;
    }

    public void producir() {
        // Lógica para producir el producto
    }

    // Getters y Setters
    public String getTipoProducto() {
        return tipoProducto;
    }

    public int getCapacidadAlmacen() {
        return capacidadAlmacen;
    }
}

