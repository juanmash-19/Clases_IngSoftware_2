/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo2patronobserver;

/**
 *
 * @author juanm
 */
public class CanalNoticias {
    private Noticia noticia;
    private List<Observador> suscriptores;
    
    public CanalNoticias(){
        suscriptores = new ArrayList<>();
    }
    
    public void agregarSuscriptor(Observador observador){
        suscriptores.add(observador);
    }
    
    public void eliminarSuscriptor(Observador observador){
        suscriptores.remove(observador);
    }
    
    public void notificarSuscriptores(Noticia ultima){
        this.noticia = utlima;
        for (Observador suscriptor: suscriptores){
            suscriptor.actualizar(noticia);
        }
    }
}
