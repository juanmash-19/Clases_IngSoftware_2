/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principioindireccion;

/**
 *
 * @author juanm
 */
public class Cliente {
    private String identificación;
    private String nombre;
    private String correo;
    
    public Cliente(String identificación, String nombre, String correo) {
        this.identificación = identificación;
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getIdentificación() {
        return identificación;
    }
    
    
}
