/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplopatronobserver;

/**
 *
 * @author juanm
 */
public class EjemploPatronObserver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DatosClimaticos datosClimaticos = new DatosClimaticos();
        Observador tablet = new PantallaTablet();
        Observador telefono = new PantallaTelefono();
        Observador televisor = new PantallaTelevisor();
        datosClimaticos.agregarObservador(tablet);
        datosClimaticos.agregatObservador(telefono);
        datosClimaticos.agregarObservador(televisor);
        datosClimaticos.notificarObservadores("LLUVIOSO");
    }
    
}
