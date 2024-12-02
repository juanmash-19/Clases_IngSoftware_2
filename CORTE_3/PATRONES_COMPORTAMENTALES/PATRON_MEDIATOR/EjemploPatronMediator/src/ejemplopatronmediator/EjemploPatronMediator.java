/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplopatronmediator;

/**
 *
 * @author juanm
 */
public class EjemploPatronMediator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediator();
        Participante usuario1 = new Usuario(mediator, "USUARIO1");
        Participante usuario2 = new Usuario(mediator, "USUARIO2");
        Participante usuario3 = new Usuario(mediator, "USUARIO3");
       mediator.add(usuario1);
       mediator.add(usuario2);
       mediator.add(usuario3);
       
       usuario1.enviar("HOLA MUNDO");
    }
    
}
