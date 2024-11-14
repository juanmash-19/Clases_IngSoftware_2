
public class Usuario {

    // Código sin aplicar YAGNI
    public static class UsuarioSinYAGNI {
        private String nombre;
        private String identification;
        private String email;
        private String campo1;
        private String campo2;
        private String campo3;
    }

    // Código aplicando YAGNI
    public static class UsuarioConYAGNI {
        private String nombre;
        private String identification;
        private String email;
    }

    public static void main(String[] args) {
        UsuarioConYAGNI usuario = new UsuarioConYAGNI();
        System.out.println("Clase Usuario simplificada con YAGNI.");
    }
}
