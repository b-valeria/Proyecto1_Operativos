/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

public class Simulacion {
    private Almacen almacen;
    private ProjectManager pm;
    private Director director;
    private Empleado[] empleados;

    public Simulacion() {
        almacen = new Almacen();
        // Inicializa trabajadores y asigna roles
    }

    public void iniciar() {
        // Inicia hilos de los empleados
    
