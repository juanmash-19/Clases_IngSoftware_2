/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploaltacohesiónbajoacoplamiento;

/**
 *
 * @author juanm
 */
public class SistemaTareas {
    private IServicioNotificaciones servicioNotificaciones;
    private ITareaDao dao;
    
    public SistemaTareas (IServicioNotificaciones servicioNotificaciones, ITareaDao dao){
        this.servicioNotificaciones = servicioNotificaciones;
        this.dao = dao;
    }    
        
    public IServicioNotificaciones getServicioNotificaciones(){
        return servicioNotificaciones;
    }
    
    public ITareaDao getDao(){
        return dao;
    }
    
}
