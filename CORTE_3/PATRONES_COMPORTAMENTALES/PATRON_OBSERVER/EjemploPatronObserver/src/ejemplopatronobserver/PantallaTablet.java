/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplopatronobserver;

/**
 *
 * @author juanm
 */
public class PantallaTablet implements Observador {
    
    private String UltimoDato;
    
    @Override 
    public void actualizar(String datoClimatico){
        ultimoDato = datoClimatico;
        System.out.println("ACTUALIZANDO DATO CLIMATICO EN TABLET:" + datoClimatico);
    }
}
