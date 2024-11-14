/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo2factorymethod;

/**
 *
 * @author juanm
 */
public class CreadoraNotificaciónEmail extends Creadora {
    
    @Override
    public Notificacion crearObjetoNotificacion() {
        return new NotificaciónEmail();
    }
}
