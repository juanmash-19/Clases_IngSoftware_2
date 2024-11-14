public class Usuario {
    private String nombre;
    private String email;
    private String constraseña;

    public Usuario(String nombre, String email, String constraseña) {
        this.nombre = nombre;
        this.email = email;
        this.constraseña = constraseña;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getEmail() {
        return email;
    }
}