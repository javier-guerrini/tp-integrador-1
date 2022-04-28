/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posnet;

/**
 *
 * @author Javier Guerrini
 */
public class Ticket {
    String nombreCompleto;
    double montoTotal, montoPorCuota;

    public Ticket(String nombreCompleto, double montoTotal, double montoPorCuota) {
        this.nombreCompleto = nombreCompleto;
        this.montoTotal = montoTotal;
        this.montoPorCuota = montoPorCuota;
    }
    @Override
    public String toString() {
        return "Ticket \n" + "nombreCompleto=" + nombreCompleto + "\nmontoTotal=" + montoTotal + "\nmontoPorCuota=" + montoPorCuota;
    }    
}
