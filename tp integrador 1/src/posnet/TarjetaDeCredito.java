/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posnet;

/**
 *
 * @author Javier Guerrini
 */
public class TarjetaDeCredito {
    
    String entidadBancaria, numeroTarjeta;
    double saldo;
    Persona persona;
    EntidadFinanciera entidadFinanciera;

    public TarjetaDeCredito(String entidadBancaria, String numeroTarjeta, double saldo, Persona persona, EntidadFinanciera entidadFinanciera) {
        this.entidadBancaria = entidadBancaria;
        this.numeroTarjeta = numeroTarjeta;
        this.saldo = saldo;
        this.persona = persona;
        this.entidadFinanciera = entidadFinanciera;
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "entidadBancaria=" + entidadBancaria + ", numeroTarjeta=" + numeroTarjeta + ", saldo=" + saldo + ", persona=" + persona + ", entidadFinanciera=" + entidadFinanciera + '}';
    }
    public boolean tieneSaldo(double monto){
        if(monto <= saldo) return true;
        else return false;
    }
    public void descontar(double monto){
        saldo -= monto;
    }
    public String getNombre(){
        return persona.getNombre() + " " +  persona.getApellido();
    }
    
}
