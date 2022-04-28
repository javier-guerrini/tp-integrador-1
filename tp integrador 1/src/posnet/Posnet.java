/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posnet;

/**
 *
 * @author Javier Guerrini
 */
public class Posnet {
    
    public static final double RECARGO_POR_CUOTA  = 0.03;
    public static final int MIN_CANT_CUOTA = 1;
    public static final int MAX_CANT_CUOTA = 6;
    
    public Posnet() {
    }
    public Ticket efectuarPago(TarjetaDeCredito tarjeta, double montoAbonar, int cantCuotas){
        Ticket ticket = null;
        if(validarDatos(tarjeta, montoAbonar, cantCuotas)){
            double montoFinal = montoAbonar + (montoAbonar*recargoPorCuota(cantCuotas));   
            if(tarjeta.tieneSaldo(montoFinal)){
                tarjeta.descontar(montoFinal);
                double montoPorCuota = montoFinal / cantCuotas;
                String nombre = tarjeta.getNombre();
                ticket = new Ticket(nombre,montoFinal,montoPorCuota);
            }
        }
        return ticket;
    }
    private boolean validarDatos(TarjetaDeCredito tarjeta, double montoAbonar, int cantCuotas){
        boolean tarjetaValida = false, montoValido = false, cuotasValidas = false;   
        if(tarjeta != null) tarjetaValida = true;
        if(montoAbonar >= 0) montoValido = true;
        if(cantCuotas >= MIN_CANT_CUOTA && cantCuotas <= MAX_CANT_CUOTA) cuotasValidas = true;
        return tarjetaValida && montoValido && cuotasValidas;
    }
    private double recargoPorCuota(int cantCuotas){
        return (cantCuotas-1) * RECARGO_POR_CUOTA;
    }   
}
