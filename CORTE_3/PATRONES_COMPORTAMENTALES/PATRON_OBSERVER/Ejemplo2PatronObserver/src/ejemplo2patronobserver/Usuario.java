/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo2patronobserver;

/**
 *
 * @author juanm
 */
public class Usuario {
    private String nombre;
    
    public Usuario(String nombre){
        this.nombre = nombre;
    }
    
    @Override 
    public void actualizar(Noticia noticia){
        System.out.println("SOY: " + nombre + "LA ULTIMA NOTICIA: " +noticia.getDescripcion();
    }
}
