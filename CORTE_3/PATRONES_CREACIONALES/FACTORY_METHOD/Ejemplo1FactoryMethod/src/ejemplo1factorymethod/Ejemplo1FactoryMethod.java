/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo1factorymethod;

/**
 *
 * @author juanm
 */
public class Ejemplo1FactoryMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Creadora creadora = new CreadoraEnvioExpress();
        ServicioEnvio envioExpress = creadora.crearServicioEnvio();
        envioExpress.enviar("PAQUETE");
    }
    
}
