/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo2patronobserver;

/**
 *
 * @author juanm
 */
public class Ejemplo2PatronObserver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CanalNoticias canal = new CanalNoticias();
        Observador usuario1 = new Usuario("LUISA");
        Observador usuario2 = new Usuario("CAMILO");
        Observador usuario3 = new Usuario("LAURA");
        Observador usuario4 = new Usuario("GUILLERMO");
        
        canal.agregarSuscriptor(usuario1);
        canal.agregarSuscriptor(usuario2);
        canal.agregarSuscriptor(usuario3);
        canal.agregarSuscriptor(usuario4);
        
        Noticia noticia = new Noticia("SE MURIO MBAPPE CON EL MADRID");
        canl.noticarSuscriptores(noticia);
    }
    
}
