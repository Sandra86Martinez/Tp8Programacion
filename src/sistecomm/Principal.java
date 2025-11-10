/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistecomm;

/**
 *
 * @author Sandra Martinez
 */

public class Principal {

    public static void main(String[] args) {

        Producto p1 = new Producto("Camiseta", 15000);
        Producto p2 = new Producto("Zapatillas", 35000);
        Producto p3 = new Producto("Pantalón", 20000);

        Pedido pedido = new Pedido();
        pedido.agregarProducto(p1);
        pedido.agregarProducto(p2);
        pedido.agregarProducto(p3);

        double total = pedido.calcularTotal();
        System.out.println("Total del pedido: $" + total);

        TarjetaCredito tarjeta = new TarjetaCredito("Sandra Martinez", "1234-5678-9999");
        double totalConDescuento = tarjeta.aplicarDescuento(total);
        tarjeta.procesarPago(totalConDescuento);

        System.out.println("Tu pedido fue procesado y está en camino.");
    }
}
