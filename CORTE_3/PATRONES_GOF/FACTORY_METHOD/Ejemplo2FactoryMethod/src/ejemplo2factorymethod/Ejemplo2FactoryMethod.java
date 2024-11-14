/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo2factorymethod;

/**
 *
 * @author juanm
 */
public class Ejemplo2FactoryMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un servicio de notificación por correo electronico
        Creator creatorEmail = new CreatorEmail();
        Notificacion notificacionEmail = creatorEmail.crearNotificacion();
        notificacionEmail.enviar("Hola, este es un mensaje por correo");
        
        //Crear un servicio de notificación por SMS
        Creator creatorSMS = new CreatorSMS();
        Notificacion notificacionSMS = creatorSMS.crearNotificacion();
        notificacionSMS.enviar("Hola, este es un mensaje por SMS")
    }
    
}
