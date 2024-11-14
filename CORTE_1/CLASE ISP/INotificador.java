public interface INotificador {
    void enviarCorreo(String destinatario, String asunto, String cuerpo);
    void enviarSMS(String dispositivo, String mensaje);
}
