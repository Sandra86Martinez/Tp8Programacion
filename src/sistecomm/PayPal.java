/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistecomm;

/**
 *
 * @author Sandra Martinez
 */
public class PayPal implements PagoConDescuento {
    private String correo;

    public PayPal(String correo) {
        this.correo = correo;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Proceso de pago con PayPal de la cuenta " + correo + " por $" + monto);
    }

    @Override
    public double aplicarDescuento(double monto) {
        double descuento = monto * 0.05;
        double montoFinal = monto - descuento;
        System.out.println("Se aplicó 5% de descuento. Monto final: $" + montoFinal);
        return montoFinal;
    }
}
   