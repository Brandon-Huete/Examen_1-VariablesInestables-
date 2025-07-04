/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

import java.time.LocalDateTime;
/**
 *
 * @author Student
 */
public class Deportista extends Persona{
    private LocalDateTime FechaNacimiento;
    private String Disiplina;

    public LocalDateTime getFechaNacimiento() {
        return FechaNacimiento;
    }

    public String getDisiplina() {
        return Disiplina;
    }

    public void setDisiplina(String Disiplina) {
        this.Disiplina = Disiplina;
    }

    public Deportista(LocalDateTime FechaNacimiento, String Disiplina, int cedula, String nombre) {
        super(cedula, nombre);
        this.FechaNacimiento = FechaNacimiento;
        this.Disiplina = Disiplina;
    }

    }

    @Override
    public String toString() {
        return "Deportista{"+"Nombre=" + nombre +"cedula"  + cedula + "FechaNacimiento=" + FechaNacimiento + ", Disiplina=" + Disiplina + '}';
    }
   
}
