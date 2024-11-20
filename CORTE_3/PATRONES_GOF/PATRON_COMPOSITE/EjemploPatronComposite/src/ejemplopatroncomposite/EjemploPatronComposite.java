/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplopatroncomposite;

/**
 *
 * @author juanm
 */
public class EjemploPatronComposite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleadoSimple1= new EmpleadoSimple();
        Empleado empleadoSimple2= new EmpleadoSimple();
        Empleado empleadoSimple3= new EmpleadoSimple();
        
        Gerente gerente = new Gerente(150000, new ArrayList<>());
        gerente.agregarSubOrdinado(empleadoSimple1);
        gerente.agregarSubOrdinado(empleadoSimple2);
        gerente.agregarSubOrdinado(empleadoSimple3);
    }
    
}
