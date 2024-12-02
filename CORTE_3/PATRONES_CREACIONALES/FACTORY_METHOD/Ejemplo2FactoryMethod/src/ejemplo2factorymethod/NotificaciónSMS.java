/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo2factorymethod;

/**
 *
 * @author juanm
 */
public class NotificaciónSMS implements Notificación {
    
    @Override 
    public void enviar(String mensaje){
        System.out.println("ESTOY ENVIANDO LA NOTIFICACION POR SMS");
    }
}
