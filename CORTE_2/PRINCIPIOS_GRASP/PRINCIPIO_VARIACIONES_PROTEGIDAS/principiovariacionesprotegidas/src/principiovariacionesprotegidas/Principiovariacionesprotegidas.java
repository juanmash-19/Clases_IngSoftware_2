/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principiovariacionesprotegidas;

/**
 *
 * @author juanm
 */
public class Principiovariacionesprotegidas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ICalcularImpuestos calcular = new CalcularImpuestoColombia();
       ServicioImpuestos servicioImpuestos = new ServicioImpuestos(calcular);
       servicioImpuestos.calcular();
    }
    
}
