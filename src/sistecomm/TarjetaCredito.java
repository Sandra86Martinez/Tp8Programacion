/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistecomm;

/**
 *
 * @author Sandra Martinez
 */
public class TarjetaCredito implements PagoConDescuento {
    private String titular;
    private String numeroTarjeta;

    public TarjetaCredito(String titular, String numeroTarjeta) {
        this.titular = titular;
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Proceso de pago con tarjeta de crédito de " + titular + " por $" + monto);
    }

    @Override
    public double aplicarDescuento(double monto) {
        double descuento = monto * 0.10;
        double montoFinal = monto - descuento;
        System.out.println("Se aplicó 10% de descuento. Monto final: $" + montoFinal);
        return montoFinal;
    }
}