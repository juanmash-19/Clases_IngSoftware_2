/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplopatronobserver;

/**
 *
 * @author juanm
 */
public class DatosClimaticos {
    List<Observador> observadores;
    private String datos;
    
    public DatosClimaticos(){
        observadores = new ArrayList<>();
    }
    
    public void agregarObservador(Observador observador){
        observadores.add(observador);
    }
    
    public void eliminarObservador(Observador observador){
        observadores.remove(observador);
    }
    
    public void notificarObservadores (String dato){
        this.dato = dato;
        for(Observador observador: observadores){
            observador.actualizar(this.datos);
        }
    }
}
