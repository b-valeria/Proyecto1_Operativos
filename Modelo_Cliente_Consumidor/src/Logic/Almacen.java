/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.util.concurrent.Semaphore;

public class Almacen {
    private int capacidadPlacasBase;
    private int capacidadCPUs;
    private int capacidadRAM;
    private int capacidadFuentes;
    private int capacidadTarjetas;

    private Semaphore mutex = new Semaphore(1);

    public Almacen() {
        this.capacidadPlacasBase = 25;
        this.capacidadCPUs = 20;
        this.capacidadRAM = 55;
        this.capacidadFuentes = 35;
        this.capacidadTarjetas = 10;
    }

    public void agregarPlacaBase() throws InterruptedException {
        mutex.acquire();
        // Lógica para agregar placa base
        mutex.release();
    }

    // Métodos similares para otros componentes...
}

