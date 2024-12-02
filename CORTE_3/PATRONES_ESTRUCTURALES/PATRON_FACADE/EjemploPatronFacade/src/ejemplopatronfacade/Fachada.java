/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplopatronfacade;

/**
 *
 * @author juanm
 */
public class Fachada {
    private SubsistemaDisponibilidad subsistemaDisponibilidad;
    private SubsistemaPago subsistemaPago;
    private SubsistemaConfirmacionPago subsistemaConfirmacionPago;
    
    public Fachada(){
        subsistemaDisponibilidad = new SubsistemaDisponibilidad();
        subsistemaPago = new SubsistemaPago();
        subsistemaConfirmacionPago = new SubsistemaConfirmacionPago();
    }
    
    public void comprarBoleto(){
        subsistemaDisponibilidad.procesarDisponibilidad();
        subsistemaPago = new SubsistemaPago();
        subsistemaConfirmacionPago.procesarConfirmacionPago();
    }
}
