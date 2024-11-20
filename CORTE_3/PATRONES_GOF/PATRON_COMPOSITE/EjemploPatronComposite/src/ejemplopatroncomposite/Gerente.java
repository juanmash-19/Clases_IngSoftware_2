/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplopatroncomposite;

/**
 *
 * @author juanm
 */
public class Gerente implements Empleado {
    private double bono;
    List <Empleado> subordinados;
    
    public Gerente(double bono, List<Empleado> subordinados){
        this.bono = bono;
        this.subordinados = subordinados;
    }
    
    @Override
    public void mostrarDetalles(){
        System.out.println(bono);
    }
    
    public void agregarSubOrdinado(Empleado empleado){
        subordinados.add(empleado);
    }
}
