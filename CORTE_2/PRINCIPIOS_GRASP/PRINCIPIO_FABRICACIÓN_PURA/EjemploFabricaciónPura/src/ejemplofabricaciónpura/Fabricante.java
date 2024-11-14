/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplofabricaciónpura;

/**
 *
 * @author juanm
 */
public class Fabricante {
    public Mesa crearMesa(String comida, String tipo){
        //Logica
        return new Mesa();
    }
    public Cocinero crearCocinero(){
        //Logica
        return new Cocinero();
    }
    public Camarero crearCamarero(){
        //Logica
        return new Camarero();
    }
}
