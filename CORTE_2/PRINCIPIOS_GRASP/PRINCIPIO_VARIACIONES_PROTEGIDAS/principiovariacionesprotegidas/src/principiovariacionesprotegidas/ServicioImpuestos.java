/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package principiovariacionesprotegidas;

/**
 *
 * @author juanm
 */
public class ServicioImpuestos {
    
    private ICalcularImpuestos calcularImpuestos;
    
    public ServicioImpuestos(ICalcularImpuestos calcularImpuestos){
        this.calcularImpuestos = calcularImpuestos;
    }
    
    public void calcular(){
        this.calcularImpuestos.calcular();
    }
}
