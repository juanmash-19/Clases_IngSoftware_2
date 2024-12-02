/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplopatronfacade2;

/**
 *
 * @author juanm
 */
public class Fachada {
    private SubsistemaCitas subsistemaCitas;
    private SubsistemaExamenes subsistemaExamenes;
    private SubsistemaMedicamentos subsistemaMedicamentos;
    
    public Fachada(){
        subsistemaCitas = new SubsistemaCitas();
        subsistemaExamenes = new SubsistemaExamenes();
        subsistemaMedicamentos = new SubsistemaMedicamentos();
    }
    
    public void tratamiento(){
        subsistemaCitas.AsistirCita();
        subsistemaExamenes.AsistirExamenes();
        subsistemaMedicamentos.aplicarMedicamentos();
    }
}
