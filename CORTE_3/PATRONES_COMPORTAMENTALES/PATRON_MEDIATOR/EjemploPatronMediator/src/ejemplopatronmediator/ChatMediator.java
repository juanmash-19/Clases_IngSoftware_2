/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplopatronmediator;

/**
 *
 * @author juanm
 */
public class ChatMediator implements Mediator {
    private List<Participante> participante;
    
    public ChatMediator(){
        participante = new ArrayList();
    }
    @Override
    public void enviar(String mensaje, Participante participantre) {
        for (Participante p: participante){
            //menos al que origino el mensaje
            if(p != participante ){
                p.recibir(mensaje);
            }
        }
    }
    
    public void add(Participante participante){
        participante.add(participante);
    }
}
