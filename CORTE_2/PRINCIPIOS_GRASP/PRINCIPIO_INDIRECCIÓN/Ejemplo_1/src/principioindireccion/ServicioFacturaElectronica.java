/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principioindireccion;

/**
 *
 * @author juanm
 */
public class ServicioFacturaElectronica implements IServicioFacturaElectronica {
    public Factura crear(Cliente cliente){
        //Logica
        return new FacturaElectronica();
    }
}
