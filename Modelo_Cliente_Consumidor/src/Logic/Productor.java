/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

public class Productor extends Empleado {
    private String tipoProducto;
    private int capacidadAlmacen;

    public Productor(double sueldoPorHora, String tipoProducto, int capacidadAlmacen) {
        super(sueldoPorHora);
        this.tipoProducto = tipoProducto;
        this.capacidadAlmacen = capacidadAlmacen;
    }

    public void producir() {
        // Implementación del método producir
        System.out.println("Produciendo " + tipoProducto);
    }

    // Getters y Setters
    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public int getCapacidadAlmacen() {
        return capacidadAlmacen;
    }

    public void setCapacidadAlmacen(int capacidadAlmacen) {
        this.capacidadAlmacen = capacidadAlmacen;
    }
}


