/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploaltacohesiónbajoacoplamiento;

/**
 *
 * @author juanm
 */
public class EjemploAltaCohesiónBajoAcoplamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SistemaTareas sistema = new SistemaTareas(new ServicioNotificacionesImpl(), new TareaDaoImpl());
        sistema.getDao().leer();
        sistema.getServicioNotificaciones().enviarNotificacionSMS();
        sistema.getServicioNotificaciones().enviarNotificacionWhatsapp();
    }
    
}
