/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistecomm;

/**
 *
 * @author Sandra Martinez
 */
    public class Producto implements Pagable {

    private String nombre;
    private double precio;

    // Constructor
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Implementación del método de la interfaz
    @Override
    public double calcularTotal() {
        return precio;  
    }
}
