/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principioindireccion;

/**
 *
 * @author juanm
 */
public class ServicioFacturaFisica implements IServicioFacturaFisica{
    FacturaFisica fs = new FacturaFisica();
    fs.setCliente(cliente);
    return fs;
}
