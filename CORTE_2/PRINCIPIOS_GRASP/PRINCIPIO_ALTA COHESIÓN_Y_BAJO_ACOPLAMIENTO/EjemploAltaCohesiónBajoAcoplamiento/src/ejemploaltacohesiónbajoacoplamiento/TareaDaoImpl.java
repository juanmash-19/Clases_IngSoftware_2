/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploaltacohesiónbajoacoplamiento;

/**
 *
 * @author juanm
 */
public class TareaDaoImpl implements ITareaDao {
    
    @Override
    public void insertar (){
        System.out.println("INSERTANDO TAREA");
    }
    
    @Override
    public void leer(){
        System.out.println("OBTENIENDO UNA TAREA");
    }
}
