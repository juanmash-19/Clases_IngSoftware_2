/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploaltacohesiónbajoacoplamiento;

/**
 *
 * @author juanm
 */
public class ServicioNotificacionesImpl implements IServicioNotificaciones {
    
    @Override
    public void enviarNotificacionSMS(){
        System.out.println("ENVIANDO NOTIFICACION POR SMS");
    }
    
    @Override 
    public void enviarNotificacionWhatsapp(){
        System.out.println("ENVIANDO NOTIFICACION POR WHATSAPP");
    }
}
