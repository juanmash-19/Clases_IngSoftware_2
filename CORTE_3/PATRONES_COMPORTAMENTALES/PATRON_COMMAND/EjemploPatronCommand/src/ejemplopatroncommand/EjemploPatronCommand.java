/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplopatroncommand;

/**
 *
 * @author juanm
 */
public class EjemploPatronCommand {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bombilla bombilla = new Bombilla();
        Ventilador ventilador = new Ventilador();
        
        Comando bombillaApagada = new BombillaApagadoComando(bombilla);
        ControlRemoto control = new ControlRemoto(bombillaApagada);
        control.ejecutar();
        
        Comando ventiladorApagado = new VentiladorApagadoComando(ventilador);
        control = new ControlRemoto(ventiladorApagado);
        control.ejecutar();
    }
}
