/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Personas;

/**
 *
 * @author Student
 */
public enum Categoria {
   JUVENIL("Juvenil"),
   MAYOR("Mayor"),
   MASTER("Master");
   
   private final String Categoria;

    private Categoria(String Categoria) {
        this.Categoria = Categoria;
    }

    @Override
    public String toString() {
        return "Categoria{" + "Categoria=" + Categoria + '}';
    }
}
