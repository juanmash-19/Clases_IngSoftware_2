/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_1_principio_polimorfismo;

/**
 *
 * @author juanm
 */
public class SistemaFacturacion {
    public void generarFactura(IFactura factura){
        factura.generar();
    }
}
