/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo1factorymethod;

/**
 *
 * @author juanm
 */
public class CreadoraEnvioExpress extends Creadora {
    
    @Override
    public ServicioEnvio crearServicioEnvio(){
        return new EnvioExpress();
    }
}
