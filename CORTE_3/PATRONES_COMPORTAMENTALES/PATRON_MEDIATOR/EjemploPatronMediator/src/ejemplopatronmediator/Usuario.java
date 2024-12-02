/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplopatronmediator;

/**
 *
 * @author juanm
 */
public class Usuario extends participante {
    private String nombre;
    
    public Usuario(Mediator mediator, String nombre){
        super(mediator);
        this.nombre = nombre;
        
    }
    
    @Override 
    public void enviar(String mensaje){
        getMediator().enviar(mensaje, this);
        
    }
    
    @Override 
    public void recibir(String mensaje){
        System.out.println(nombre + ":" mensaje);
    }
    
}
