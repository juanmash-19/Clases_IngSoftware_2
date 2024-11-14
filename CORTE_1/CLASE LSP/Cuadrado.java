class Cuadrado extends  Forma {
    private double lado;

    @Override
    public double calcularArea() {
        return lado * lado;
    }
    
}
