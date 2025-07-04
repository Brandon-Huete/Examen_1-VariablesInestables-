/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

/**
 *
 * @author Student
 */
public class Entrenador extends Persona{
    private String Equipo;

    public String getEquipo() {
        return Equipo;
    }

    public void setEquipo(String Equipo) {
        this.Equipo = Equipo;
    }

    public Entrenador(String Equipo, int cedula, String nombre) {
        super(cedula, nombre);
        this.Equipo = Equipo;
    }

   

    @Override
    public String toString() {
        return "Entrenador{" + "Equipo=" + Equipo + '}';
    }
    
    
}
