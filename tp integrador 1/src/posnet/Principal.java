/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posnet;

/**
 *
 * @author Javier Guerrini
 */
public class Principal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Posnet posnet = new Posnet();        
        Persona cliente = new Persona("45214200", "Javier", "Guerrini", "1162126551", "javierguerrini750@gmail.com");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("Santander", "7890490538", 15000, cliente, EntidadFinanciera.MASTERCARD);
        System.out.println(tarjeta);
        System.out.println(cliente.toString());
        Ticket ticket = posnet.efectuarPago(tarjeta, 10000, 5);
        System.out.println("");
        System.out.println(tarjeta);
        System.out.println(ticket);    
    }
    
}
