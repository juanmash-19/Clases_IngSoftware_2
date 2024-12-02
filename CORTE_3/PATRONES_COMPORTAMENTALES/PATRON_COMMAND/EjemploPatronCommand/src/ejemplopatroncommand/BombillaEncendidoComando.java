/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplopatroncommand;

/**
 *
 * @author juanm
 */
public class BombillaEncendidoComando implements Comando {
    private Bombilla bombilla;
    
    public BombillaEncendidoComando(Bombilla bombilla){
        this.bombilla = bombilla;
    }

    @Override
    public void ejecutar() {
       bombilla.encender();
    }
}
