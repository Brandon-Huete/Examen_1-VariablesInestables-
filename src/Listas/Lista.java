/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Listas;

/**
 *
 * @author Student
 * @param <T>
 */
public interface Lista  <T> {
    boolean Agregar (T t);
    boolean Remover (T t);
    T buscar (Object id);
    
    
}
