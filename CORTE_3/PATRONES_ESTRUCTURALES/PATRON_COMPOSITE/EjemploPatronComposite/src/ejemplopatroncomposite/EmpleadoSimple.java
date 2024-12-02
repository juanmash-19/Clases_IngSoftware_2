/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplopatroncomposite;

/**
 *
 * @author juanm
 */
public class EmpleadoSimple implements Empleado {
    private String nombre;
    private String cargo;

    @Override
    public void mostrarDetalles() {
        System.out.println(nombre);
        System.out.println(cargo);
    }
    
    
}
