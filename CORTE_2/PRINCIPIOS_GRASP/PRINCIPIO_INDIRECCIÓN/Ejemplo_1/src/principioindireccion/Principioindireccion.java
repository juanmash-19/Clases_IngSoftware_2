/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principioindireccion;

/**
 *
 * @author juanm
 */
public class Principioindireccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IServicioFacturaFisica servicioFacturaFisica = new ServicioFacturaFisica();
        Cliente cliente = new Cliente ("11936542709", "Juan", "Suarez");
        FacturaFisica fs = servicioFacturaFisica.crear(cliente);
        System.out.print(fs.getCliente().getIdentificacion());
    }
}
