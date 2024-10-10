/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

public class ProjectManager extends Empleado {
    private int animeHoras;

    public ProjectManager(double sueldoPorHora, int animeHoras) {
        super(sueldoPorHora);
        this.animeHoras = animeHoras;
    }

    public void gestionarProyecto() {
        // Implementación del método gestionarProyecto
        System.out.println("Gestionando proyecto con " + animeHoras + " horas asignadas.");
    }

    // Getters y Setters
    public int getAnimeHoras() {
        return animeHoras;
    }

    public void setAnimeHoras(int animeHoras) {
        this.animeHoras = animeHoras;
    }
}

